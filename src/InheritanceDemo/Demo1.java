package InheritanceDemo;

class A{
    public void show(){
        System.out.println("show of a");
    }

    public void chapri(){
        System.out.println("hello i am pandya");
    }
}

class B extends A{
    public void show(){
        System.out.println("show of b");
    }


    public void chapri() {
        System.out.println("kya jala");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.chapri();
        obj.show();

    }
}
