class Demo{
    static int a,b;
    int x,y;
    static {
        a =10;
        b = 20;
        System.out.println("static initalization block");
    }

    {
        x = 30;
        y = 40;
        System.out.println("non static initalization block");
    }

    public Demo(){
        System.out.println("non parameterized constructor");
    }

    public void disp(){
        System.out.println("The value of x is:"+x+"and of y is:"+y);
    }

    public static void disp1(){
        System.out.println("The value of a is:"+a+"ans of b is:"+b);
    }
}

public class LaunchSt {
    public static void main(String[] args) {
        Demo.disp1();
        Demo d = new Demo();

        d.disp();
    }
}
