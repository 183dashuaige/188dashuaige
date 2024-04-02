package 实验4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Mystudent> List = new ArrayList<>();//创建集合
        List.add(new Mystudent(5,"小东"));
        List.add(new Mystudent(2,"小西"));
        List.add(new Mystudent(3,"小南"));
        List.add(new Mystudent(1,"小北"));
        Collections.sort(List);
        for (int i = 0; i < List.size(); i++){
            Mystudent stu = List.get(i);
            System.out.println("学号：" + stu.sno + " " + "姓名：" + stu.sname);
        }
    }
}
