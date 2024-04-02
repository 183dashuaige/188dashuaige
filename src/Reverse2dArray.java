import java.util.Random;
import java.util.Scanner;
public class Reverse2dArray {
    static int[][] arrays;
    public Reverse2dArray(int r, int c) {//构造方法
        arrays = new int[r][c];
        buildRandArray();
            }
    public void buildRandArray(){//构造随机数组
        Random random = new Random();
        for(int i = 0; i < arrays.length; i++)
            for(int j = 0; j < arrays[i].length; j++)
                arrays[i][j] = random.nextInt(100);
    }
    public void showArray(int[][] c){//方法：输出数组
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
    public int[][] reverse2dArray () {//转置一个随机二维数组
        int [][] b = new int [arrays[0].length] [arrays.length] ;
        for (int i = 0; i <arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                b[i][j] = arrays[j][i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int r, c;
        System.out.println("请输入行数和列数：");
       Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        c = scan.nextInt();
        Reverse2dArray array = new Reverse2dArray(r, c);
        System.out.println("输出原数组：");
        array.showArray(arrays);
        System.out.println("输出转置后的数组：");
        int [][] a =  array.reverse2dArray();
        array.showArray(a);
    }
}