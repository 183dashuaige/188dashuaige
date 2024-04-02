package 任务;

class Task {
    private int taskId;                // 任务ID
    private String taskContent;        // 任务内容
    private String correctOption;      // 正确选项
    private long timeLimit;             // 时间限制
    private int x;                     // 任务地点的x坐标
    private int y;                     // 任务地点的y坐标

    public Task(int taskId, String taskContent, String correctOption, long timeLimit, int x, int y) {
        this.taskId = taskId;
        this.taskContent = taskContent;
        this.correctOption = correctOption;
        this.timeLimit = timeLimit;
        this.x = x;
        this.y = y;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public long getTimeLimit() {
        return timeLimit;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
