import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;
import java.util.Scanner;
//编写补充完成“使用一维数组读取并处理成绩”的DealScore程序。
public class DealScore {
    public static void show(double[] ascore){
        System.out.print("输出成绩：");
        for (int i = 0; i < ascore.length; i++){
            System.out.println(ascore[i]);
        }
    }
    public static double getSum(double[] ascore){
        double sum = 0;
        for (int i =0; i < ascore.length; i++){
            sum += ascore[i];
        }
        return sum;
    }
    public static double getAvg(double[] ascore){
        double sum = 0,avg;
        for (int i =0; i < ascore.length; i++){
            sum += ascore[i];
        }
        avg = sum/ ascore.length;
        return avg;
    }
    public static double getMax(double[] ascore){
                //Arrays.sort(int[] a)这种形式是对一个数组的所有元素进行排序，并且是按从小到大的顺序.
        Arrays.sort(ascore);
        return ascore[ascore.length-1];
    }
    public static double getMin(double[] ascore){
        Arrays.sort(ascore);
        return ascore[0];
    }
    public static void descSort(double[] ascore){
        Arrays.sort(ascore);
        for (int i = ascore.length-1; i >= 0; i --){
            System.out.println(ascore[i]);
        }
    }
   /*------TODO:开始------*/
    public static void main(String[] args) {
        System.out.print("请输入人数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//定义数组长度
        double [] arr = new double[n];//定义数组
        System.out.println("请输入"+n+"个人的成绩");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();//赋值
        }
        show(arr);
        System.out.println("总成绩为："+getSum(arr));
        System.out.println("平均成绩为："+getAvg(arr));
        System.out.println("最大成绩为："+getMax(arr));
        System.out.println("最小成绩为："+getMin(arr));
        System.out.println("逆序：");
        descSort(arr);
    }
    /*------TODO:结束------*/
}
