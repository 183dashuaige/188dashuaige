import java.util.Random;
public class roleA {//父类
    String name;
    double bleed;
    double attack;
    double defend;
    double empirical_value;
    int grade;
    double attack_Increased;
    double defense_Increased;
    boolean critical_hit;//触发暴击（若触发true则暴击率乘以角色的本身的攻击力，否则正常攻击伤害）
    boolean shields_hit;//触发护盾（若触发true则躲避所有伤害，若触发false则正常受击）
    //构造方法,赋初值
    public roleA(){
        name = "A";
        bleed = 100.00;
        attack = 10.00;
        defend = 2.00;
        empirical_value = 1000;
        grade = 10;
        attack_Increased = 0.50;
        defense_Increased = 0.10;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBleed() {
        return bleed;
    }

    public void setBleed(double bleed) {
        this.bleed = bleed;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
    public double getDefend() {
        return defend;
    }
    public void setDefend(double defend) {
        this.defend = defend;
    }
    public double getEmpirical_value() {
        return empirical_value;
    }
    public void setEmpirical_value(double empirical_value) {
        this.empirical_value = empirical_value;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public double getAttack_Increased(){
        return attack_Increased;
    }
    public void setAttack_Increased(){
        this.attack_Increased = attack_Increased;
    }
    public double getDefense_Increased(){
        return defense_Increased;
    }
    public void setDefense_Increased(){
        this.defense_Increased = defense_Increased;
    }
    public boolean isCritical_hit() {
        return critical_hit;
    }
    public void setCritical_hit(boolean critical_hit) {
        this.critical_hit = critical_hit;
    }
    public boolean isShields_hit() {
        return shields_hit;
    }
    public void setShields_hit(boolean shields_hit) {
        this.shields_hit = shields_hit;
    }


    public static boolean possibility(int possibility){//触发概率
        final Random random =new Random();
        if(random.nextInt(100)<possibility)
            return true;
        return false;
    }
    public boolean critical_hit() {//触发暴击概率
        if (possibility(20)) {
            return true;
        } else {
            return false;
        }
    }
    //触发护盾
    public boolean shields_hit() {//触发护盾概率
        if (possibility(20)) {
            return true;
        } else {
            return false;
        }
    }
    //攻击

    public double gongji(double attack){//攻击效果，返回实际攻击值
            if (critical_hit()){
                double attack1 = attack + attack * getAttack_Increased();
                System.out.printf("A暴击效果！(攻击力：%.2f)\n",attack1);
                return attack1;
            }else {
                System.out.printf("A一般攻击(攻击力：%.2f)\n",attack);
                return attack;
            }
    }
    public void battle(double attack, double defend){ //对战时处理函数（攻方实际攻击值，防方实际防御值）
        double hurt = 0.0;//受到伤害
        double residue_bleed;//剩余生命值
        if(attack > defend) {    //对手攻击力大于自身防御力则受到伤害，否则受伤值为0
            hurt = attack - defend;
        }else {
            hurt = 0.0;
        }
        residue_bleed = bleed - hurt;//剩余生命值
        System.out.printf("%s做出了防御，受到%.2f点伤害！",this.name,hurt);
        if(residue_bleed<0.0)
            residue_bleed = 0.0;//生命最低值0
        System.out.printf("还剩%.2f点生命值\n",residue_bleed);   //打印剩余生命值
        setBleed(residue_bleed);   //当前生命值
    }
    public double fangyu(double defend){//防御效果，返回实际防御值
            if (shields_hit()){
                double defend1 = defend + defend * getDefense_Increased();
                System.out.printf("A护盾效果！(防御力：%.2f)\n",defend1);
                return defend1;
            }else {
                System.out.printf("A一般防御(防御力：%.2f)\n",defend);
                return defend;
            }
        }

    //阵亡时的处理函数，返回一个布尔值，代表是否死亡
    public boolean die() {
        boolean flag=true; //初始化，代表活着
        if (bleed <= 0.0) {  //生命值小于等于0则阵亡
            flag = false;
        }
        return flag;//返回生存状态
    }
    public  void jingyanzengjia(int e){//结算环节，计算经验
        int ex = e*getGrade();
        setEmpirical_value(getEmpirical_value()+ex);
        System.out.println("经验+"+ex);//显示经验增加多少
        System.out.println("当前经验："+getEmpirical_value());//显示当前所有经验
    }
}

