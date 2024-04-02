package 任务;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Player {
    private int id;                    // 玩家ID
    private String name;               // 玩家姓名
    private List<Task> taskList;       // 玩家任务列表
    private int x;                     // 玩家的x坐标
    private int y;                     // 玩家的y坐标

    public Player(int id, String name, int x, int y) {
        this.id = id;
        this.name = name;
        this.taskList = new ArrayList<>();
        this.x = x;
        this.y = y;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }
}

public class GameSimulation {
    public static void main(String[] args) {
        // 创建玩家对象
        Player player = new Player(1, "玩家1", 0, 0);

        // 创建两个任务对象，并添加到玩家的任务列表中
        Task task1 = new Task(TaskIdGenerator.generateId(), "题目1", "A", 30000, 20, 5);
        Task task2 = new Task(TaskIdGenerator.generateId(), "猜数字游戏", "42", 30000, 1, 10);
        player.addTask(task1);
        player.addTask(task2);

        // 打印获得任务信息和当前时间
        System.out.println(player.getName() + " 获得任务1：" + task1.getTaskContent());
        System.out.println("当前时间：" + System.currentTimeMillis());

        System.out.println(player.getName() + " 获得任务2：" + task2.getTaskContent());
        System.out.println("当前时间：" + System.currentTimeMillis());

        // 到达任务地点
        player.setX(task1.getX());
        player.setY(task1.getY());
        System.out.println(player.getName() + " 到达任务1地点");

        // 完成任务1
        boolean task1Completed = false;
        long startTime = System.currentTimeMillis();
        while (!task1Completed) {
            // 模拟玩家做答
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入答案：");
            String answer = scanner.nextLine();

            // 判断答案是否正确
            if (answer.equals(task1.getCorrectOption())) {
                task1Completed = true;
                player.removeTask(task1);
                System.out.println(player.getName() + " 完成任务1");
                System.out.println("完成时间：" + System.currentTimeMillis());
            } else {
                System.out.println("答案错误，请重新作答。");
            }

            // 判断是否超时
            if (System.currentTimeMillis() - startTime > task1.getTimeLimit()) {
                task1Completed = true;
                player.removeTask(task1);
                System.out.println(player.getName() + " 超时完成任务1");
                System.out.println("完成时间：" + System.currentTimeMillis());
            }
        }

        // 到达任务地点
        player.setX(task2.getX());
        player.setY(task2.getY());
        System.out.println(player.getName() + " 到达任务2地点");

        // 完成任务2：猜数字游戏
        int randomNumber = new Random().nextInt(100) + 1;
        boolean task2Completed = false;
        int guessCount = 0;
        startTime = System.currentTimeMillis();
        while (!task2Completed) {
            // 模拟玩家猜测数字
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入猜测的数字：");
            int guessNumber = scanner.nextInt();

            // 判断猜测的数字与随机数字的关系
            if (guessNumber < randomNumber) {
                System.out.println("猜测的数字太低了");
                guessCount++;
            } else if (guessNumber > randomNumber) {
                System.out.println("猜测的数字太高了");
                guessCount++;
            } else {
                task2Completed = true;
                player.removeTask(task2);
                System.out.println(player.getName() + " 完成任务2");
                System.out.println("猜测次数：" + guessCount);
                System.out.println("完成时间：" + System.currentTimeMillis());
            }

            // 判断是否超时
            if (System.currentTimeMillis() - startTime > task2.getTimeLimit()) {
                task2Completed = true;
                player.removeTask(task2);
                System.out.println(player.getName() + " 超时完成任务2");
                System.out.println("猜测次数：" + guessCount);
                System.out.println("完成时间：" + System.currentTimeMillis());
            }
        }
    }
}