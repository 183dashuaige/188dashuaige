public class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        if (!t.isTri()){
            System.out.println(t.getA()+","+t.getB()+","+t.getC()+"不能构成三角形");
        }else {
            System.out.printf("边长为%d，%d，%d的周长为：%d，面积为：%.2f",t.getA(),t.getB(),t.getC(),t.circumference(),t.area());
        }
    }
}
