package 实验4;

public class Mystudent implements Comparable<Mystudent>{
    public int sno;
    public String sname;
    public int getSno(){
        return sno;
    }
    public void setSno(int sno){
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    Mystudent(){
    }
    Mystudent(int sno,String sname){
        this.sno=sno;
        this.sname=sname;
    }
    @Override
    public  int compareTo(Mystudent s){
        return this.getSno()-s.getSno();
    }
}
