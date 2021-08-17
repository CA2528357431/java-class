package base;

public class per{
    int age;
    int iq;
    String name;
    public static int totalper = 0;

    public per(int age, int iq, String name){
        this.age = age;
        this.iq = iq;
        this.name = name;
        per.totalper+=1;
    }


    public void say(int num){
        System.out.println("person: "+num);
    }

    public void eat(int num){
        System.out.println("eat: "+num+" kg");
    }
}