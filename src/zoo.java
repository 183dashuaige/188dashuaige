public class zoo {
    static class Tiger{//老虎类
        String name;
        Tiger(String name){
            this.name = name;
        }
        public void run(){
            System.out.printf("%s在森林里猎物\n", name);
        }
    }
    static class Cat extends Tiger{//猫咪类

        Cat(String name) {
            super(name);
        }
        @Override//方法重写
        public void run(){
            System.out.printf("%s在沙发上卖萌\n", name);
        }
    }
}
