public class new05 {
    public static void main(String[] args){

    ani sth = new  cat(100,80);
    sth.eat();
    sth.sleep();

    }
}

abstract class ani{
    int num;
    ani(int num){
        this.num = num;
    }
    abstract void eat();

    void sleep(){
        System.out.println("sleeping");
    };

}

class cat extends ani{

    int age;
    cat(int num,int age) {
        super(num);
        this.age = age;
    }

    void eat(){
        System.out.println("cat: "+num);
    }

    void sleep(){
        System.out.println("cat sleeping");
    };


}

// 抽象方法
// 只声明方法，无实际内容
// 抽象类
// 有抽象方法就是抽象类

// 抽象类不可用自己的构造实例化
// 但可通过转型来实例化