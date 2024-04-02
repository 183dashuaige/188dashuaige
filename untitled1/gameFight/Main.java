import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("--战斗开始--");
        int num = 0;//记录回合
        int flag1 = 0;//A阵亡标记
        int flag2 = 0;//B阵亡标记
        roleA a = new roleA();
        roleB b = new roleB();
        rwd_a r1 = new rwd_a();
        rwd_b r2 = new rwd_b();
        monsterM m = new monsterM();
        //固定攻击顺序A->B->M，即A攻M防->B攻M防->M攻A防->M攻B防
        while (m.die()) {//M没死时，循环继续
            num++;
            System.out.println("回合" + num);//显示回合数
            if (a.die()) {//A没死，A攻击
                m.battle(a.gongji(a.attack), m.fangyu(m.defend));//A攻M防
            } else {
                System.out.println(a.name + "已阵亡！");
                flag1 = 1;
            }

            if (b.die()) {//B没死，B攻击
                m.battle(b.gongji(b.attack), m.fangyu(m.defend));//B攻M防
            } else {
                System.out.println(b.name + "已阵亡！");
                flag2 = 1;
            }
            if (!m.die()) {
                System.out.println(m.name + "已阵亡");//如果M死，跳出循环
                break;
            }
            if (flag1 == 0) {//A没死，M攻击
                a.battle(m.gongji(m.attack), a.fangyu(a.defend));//M攻A防
            }
            if (flag2 == 0) {//B没死，M攻击
                b.battle(m.gongji(m.attack), b.fangyu(b.defend));//M攻B防
            }
            System.out.println("\n");
            if (flag1 == 1 && flag2 ==1){
                System.out.println("对战失败！");//A，B都阵亡，对战失败，跳出循环
                break;
            }
        }
        System.out.println("--战斗结束--");
        System.out.println("\n");
        if (flag1 == 0) {//A的结算结果
            System.out.println("--A结算时间--");
            final Random random = new Random();//随机数
            if (random.nextInt(100) < 40) {//概率40%，即在0-100中寻找40以内的随机数
                System.out.print("从宝箱a中");
                r1.rwd();
                a.jingyanzengjia(200);
            } else {
                System.out.print("从宝箱b中");
                r2.rwd();
                a.jingyanzengjia(100);
            }
        }
        if (flag2 == 0) {//B的结算结果
            System.out.println("--B结算时间--");
            final Random random = new Random();
            if (random.nextInt(100) < 40) {
                System.out.print("从宝箱a中");
                r1.rwd();
                b.jingyanzengjia(200);
            } else {
                System.out.print("从宝箱b中");
                r2.rwd();
                b.jingyanzengjia(100);
            }
        }
    }
}