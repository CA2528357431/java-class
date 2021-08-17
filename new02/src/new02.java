// package


public class new02 {
    public static void main(String[] args){

        base.per per1 = new base.per(18,200,"CAOAN");
        edu.stu stu1 = new edu.stu(19,80,"hcw",0);

        per1.say(10);
        stu1.say(10);

        per1.eat(1);
        stu1.eat(1);

        System.out.println(base.per.totalper);

    }
}

// final 的 class 不可被继承

// 变量也可以被final修饰
// 表示不可变

// 权限符号见图