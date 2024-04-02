import java.util.Random;

public class rwd_a {//父类
      String rwdname1;
     int weight1;//金刚石
      String rwdname2;
     int weight2;//红宝石
      String rwdname3;
     int weight3;//乾坤袋
    String rwdname4;
     int weight4;// 如意丹
     String rwdname5;
    int weight5;//金柳露；
     String rwdname6;
    int weight6;//

    public rwd_a(){//构造方法
        rwdname1 = "金刚石";
        rwdname2 = "红宝石";
        rwdname3 = "乾坤袋";
        rwdname4 = "如意丹";
        rwdname5 = "金柳露";
        weight1 = 20;//权重
        weight2 = 20;
        weight3 = 10;
        weight4 = 20;
        weight5 = 30;
    }
    public  int possibility(){//奖励概率
        final Random random =new Random();//随机数
        int r = random.nextInt(100);
        if(r<weight1){//用区间确定概率范围
            return 1;
        }else if (r>weight1 && r<=(weight1 + weight2)){
            return 2;
        } else if (r>(weight1+weight2) && r<=(weight1+weight2+weight3)) {
            return 3;
        }else if (r>(weight1+weight2+weight3) && r<=(weight1+weight2+weight3+weight4)){
            return 4;
        }else if (r>(weight1+weight2+weight3+weight4) && r<=(weight1+weight2+weight3+weight4+weight5)){
            return 5;
        }else  if (r>(weight1+weight2+weight3+weight4+weight5) && r<=(weight1+weight2+weight3+weight4+weight5+weight6)){
            return 6;
        }
        return 0;
    }
    public void rwd(){//显示获得的奖励
        switch (possibility()){
            case 1:System.out.println("获得了"+rwdname1);break;
            case 2:System.out.println("获得了"+rwdname2);break;
            case 3:System.out.println("获得了"+rwdname3);break;
            case 4:System.out.println("获得了"+rwdname4);break;
            case 5:System.out.println("获得了"+rwdname5);break;
            case 6:System.out.println("获得了"+rwdname6);break;
            default:
                System.out.println("出错了！");
        }
    }
}
