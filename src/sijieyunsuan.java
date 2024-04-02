/* （1）每次执行程序，随机生成两个两位大于等于0的整数，假设为a和b。
（2）然后要求用户计算a+b、a-b、a*b和a/b（a整除以b）的值。
（3）计算完之后，综合给出用户的答题情况，包括：用户答案、正确答案、是否答对。
（4）假设每道算式25分，给出用户是否合格的结论（60分以上合格）。
（5）询问用户是否继续测试？按y键继续，按n键退出本测试程序。*/
import java.util.Scanner;
public class sijieyunsuan {
    public static void main(String[] args) {
        String a5;
        do {
            int c =0;//计算得分
            int a = (int) (Math.random() *100 + 0);
            int b = (int) (Math.random() *100 + 0);
            //生成范围在[a，b]之间的随机整数的公式：(int)(Math.random() * (b-a+1) + a)
            System.out.println("随机生成两个整数a和b： "+a+ "和" + b);
            System.out.println("请输入a+b的值：");
            Scanner scan = new Scanner(System.in);
            int a1 = scan.nextInt();
            if (a1 == a+b){
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a+b) +"\n"+"回答正确！");
                c+=25;
            }else {
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a+b) +"\n"+"回答错误！");
            }
            System.out.println("请输入a-b的值：");
            int a2 = scan.nextInt();
            if (a2 == a-b){
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a-b) +"\n"+"回答正确！");
                c+=25;
            }else {
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a-b) +"\n"+"回答错误！");
            }
            System.out.println("请输入a*b的值：");
            int a3 = scan.nextInt();
            if (a3 == a*b){
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a*b) +"\n"+"回答正确！");
                c+=25;
            }else {
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a*b) +"\n"+"回答错误！");
            }
            System.out.println("请输入a/b的值：");
            int a4 = scan.nextInt();
            if (a4 == a/b){
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a/b) +"\n"+"回答正确！");
                c+=25;
            }else {
                System.out.println("用户答案："+a1+"\n"+"正确答案："+(a/b) +"\n"+"回答错误！");
            }
            if (c >=60){
                System.out.println("恭喜你！你及格了！");
            }else {
                System.out.println("很遗憾。你没及格。");
            }
            System.out.println("是否继续测试？按y键继续，按n键退出本测试程序");
            a5 = scan.next();
        }while(a5.equals("y"));
        System.out.println("本次测试结束");
    }
}
