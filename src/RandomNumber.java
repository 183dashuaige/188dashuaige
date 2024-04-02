import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() *90 + 10);
        System.out.println("随机产生一个两位随机正整数："+number);
    }
}