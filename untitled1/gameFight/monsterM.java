public class monsterM extends roleA {//继承类
    public monsterM(){//构造方法
        name = "M";
        bleed = 250.00;
        attack = 8.00;
        defend = 5.00;
        attack_Increased = 0.50;
        defense_Increased = 0.10;
    }
    @Override//方法重写
    public boolean shields_hit() {
        if (possibility(10)) {
            return true;
        } else {
            return false;
        }
    }
    public double gongji(double attack){//攻击效果
        if (critical_hit()){
            double attack1 = attack+attack * getAttack_Increased();
            System.out.printf("M暴击效果！(攻击力：%.2f)\n",attack1);
            return attack1;
        }else {
            System.out.printf("M一般攻击(攻击力：%.2f)\n",attack);
            return attack;
        }
    }
    public double fangyu(double defend){//防御效果
        if (shields_hit()){
            double defend1 = defend+defend*getDefense_Increased();
            System.out.printf("M护盾效果！(防御力：%.2f)\n",defend1);
            return defend1;
        }else {
            System.out.printf("M一般防御(防御力：%.2f)\n",defend);
            return defend;
        }
    }


}
