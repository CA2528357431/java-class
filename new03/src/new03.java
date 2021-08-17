// 多态

public class new03 {
    public static void main(String[] args){

    dog d = new dog(10);
    cat c = new cat(8);

    d.eat(3);
    c.eat(6);

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

    cat(int num) {
        super(num);
    }

    void eat(int id){
        System.out.println("cat: "+id);
        super.eat();
    }

}

class dog extends ani{

    dog(int num) {
        super(num);
    }

    void eat(int id){
        System.out.println("dog: "+id);
        super.eat();
    }

}