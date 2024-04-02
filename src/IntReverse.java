public class IntReverse {
    public static  void reverse(int x){/*实现将x的值逆序输出，即x=1234，则输出4321 */
        int y;
        if (x == 0){
            return;
        }
        y = x%10;//取余
        x = x/10;//
        System.out.printf("%d",y);
        reverse(x);
    }

    public static void main(String[] args) {
        reverse(1234);
    }
}
