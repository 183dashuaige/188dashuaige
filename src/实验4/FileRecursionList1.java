package 实验4;
//import java.io.File;
//public class Filesum{
//    static int f = 0;//文件个数
//    static int d = 0;//目录个数
//    public Filesum(String path) {
//        File file = new File(path);
//        print(file);
//    }
//    public static void print(File file) {
//        if (file != null) {
//            if (file.isDirectory()) {
//                File[] f = file.listFiles();
//                if (f != null) {
//                    for (int i = 0; i < f.length; i++) {
//                        d++;
//                        print(f[i]);//递归
//                    }
//                }
//            } else {
//                f++;
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Filesum F = new Filesum("D:\\测试");
//        System.out.println(F + "含有的目录个数为：" +d);
//        System.out.println(F + "含有的文件个数为：" +f);
//
//    }
//
//
//}
import java.io.File;
public class FileRecursionList1 {
    static int f=0;//文件个数
    static int D=0;//目录个数
    public static void print(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File f[] = file.listFiles();

                if (f != null) {
                    for (int i = 0; i < f.length; i++) {
                        D++;
                        print(f[i]);
                    }
                }
            } else {
                f++;
            }
        }


    }

    public static void main(String[] args) {
        File my = new File("D:\\数据库实验");
        print(my);
        System.out.println(my+" 含有的目录个数为"+D);
        System.out.println(my+" 含有的文件个数为"+f);

    }
}