public class roleB extends roleA {//继承类
    public roleB(){//构造方法
        name = "B";
        bleed = 110.00;
        attack = 12.00;
        defend = 3.00;
        empirical_value = 2000;
        grade = 15;
        attack_Increased = 0.30;
        defense_Increased = 0.15;
    }
    @Override//方法重写
    public boolean critical_hit(){
        if (possibility(25)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean shields_hit() {
        if (possibility(30)) {
            return true;
        } else {
            return false;
        }
    }
    public double gongji(double attack){//攻击效果
        if (critical_hit()){
            double attack1 = attack+attack * getAttack_Increased();
            System.out.printf("B暴击效果！(攻击力：%.2f)\n",attack1);
            return attack1;
        }else {
            System.out.printf("B一般攻击(攻击力：%.2f)\n",attack);
            return attack;
        }
    }
    public double fangyu(double defend){//防御效果
        if (shields_hit()){
            double defend1 = defend+defend*getDefense_Increased();
            System.out.printf("B护盾效果！(防御力：%.2f)\n",defend1);
            return defend1;
        }else {
            System.out.printf("B一般防御(防御力：%.2f)\n",defend);
            return defend;
        }
    }

}

