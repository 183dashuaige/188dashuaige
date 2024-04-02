public class Triangle{
    int a;
    int b;
    int c;
    private final boolean canTri;

    public int getA() {
        return a;
    }
    public int getB(){
        return b;
    }

    public int getC() {
        return c;
    }
    public Triangle(){
        a = 23;
        b = 14;
        c = 15;
        canTri = false;
    }
    public boolean isTri() {
        if (getA()+getB()>getC() && getA()+getC()>getB() && getB()+getC()>getA() && getA()-getB()<getC() && getA()-getC()<getB() && getB()-getC()<getA()){
            return true;
        }
        return canTri;
    }
    public int circumference(){
        return getA()+getB()+getC();
    }
    public double area(){
        int n = circumference()/2;
        double m = (double) n * (n - getA()) * (n - getB()) * (n - getC());
        return Math.sqrt(m);
    }
}
