package edu;



final public class stu extends base.per {
    int rank;

    public stu(int age, int iq, String name, int rank){
        super(age,iq,name);
        // 上级调用
        this.rank = rank;
    }


    public void say(int num){
        System.out.println("stu: "+num);
    }

    public void eat(int num){
        System.out.println("i am a stu");
        super.eat(num);
    }


}