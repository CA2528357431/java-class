// 继承

// 只能单继承

public class new01 {
    public static void main(String[] args){

        per per1 = new  per(18,200,"CAOAN");
        stu stu1 = new stu(19,80,"hcw",0);

        per1.say(10);
        stu1.say(10);

        per1.eat(1);
        stu1.eat(1);

        stu1.done(999);
        stu1.done();
        // overload
        // 先该名称函数，想找无参done，没有就向上级找

        System.out.println(stu.totalper);

    }
}

class per{
    int age;
    int iq;
    String name;
    static int totalper = 0;

    per(int age, int iq, String name){
        this.age = age;
        this.iq = iq;
        this.name = name;
        per.totalper+=1;
    }
    void say(int num){
        System.out.println("person: "+num);
    }

    void eat(int num){
        System.out.println("eat: "+num+" kg");
    }

    void done(){
        System.out.println("no");
    }
}

class stu extends per{
    int rank;

    stu(int age, int iq, String name, int rank){
        super(age,iq,name);
        // 上级调用
        this.rank = rank;
    }

    @Override
    void say(int num){
        System.out.println("stu: "+num);
    }

    // @Override
    // 不写无影响
    void eat(int num){
        System.out.println("i am a stu");
        super.eat(num);
    }


    void done(int num){
        System.out.println("no"+num);
    }


}
