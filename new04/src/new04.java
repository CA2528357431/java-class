public class new04 {
    public static void main(String[] args){

        ani x = new cat(9,7);
        x.eat();

        // 转型时，之可用父中有的量和函数
        // 方法跟着子代


    }
}

class ani{
    int num;
    ani(int num){
        this.num = num;
    }
    void eat(){
        System.out.println("eat: "+num);
    }


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

}