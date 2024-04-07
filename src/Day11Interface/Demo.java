package Day11Interface;

interface  Draw{
    int a = 10;
    void display();

    default  void print(){
        System.out.println("hi hi hi");
    }

    static void hello(){
        System.out.println("hui hui hui");
    }
}
class InterfaceDemo implements Draw{
   public void display(){
        System.out.println("display of interface");
    }
}
public class Demo {
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.display();
        obj.print();
        Draw.hello();
    }
}
