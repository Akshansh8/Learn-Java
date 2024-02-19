
abstract class Human{
    public Human(){
        System.out.println("Hey I am human");
    }
    abstract void name();


    void concrete(){
        System.out.println("This is concrete");
    }
}

class Employee1 extends Human{
    void name(){
        System.out.println("My name is Akshansh");
    }
}
public class Launch3 {
    public static void main(String[] args) {


        Employee1 e = new Employee1();
        e.name();
    }
}