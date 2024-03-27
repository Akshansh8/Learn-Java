interface A{
    void add();
    void sub();

    default void nayafeature(){
        System.out.println("java 8 k baad se ye aise kaam krta hai");
    }
}

interface A1{
    void mul();
}
class B {
    void disp(){
        System.out.println("display method");
    }
}

class C extends B implements A,A1{
    @Override
    public void add() {
        System.out.println("implementation of add method");
    }

    public void sub(){
        System.out.println("implementation of sub method");
    }

    public void  mul(){
        System.out.println("implementation of mul method");
    }
}
public class Interface1 {
    public static void main(String[] args) {
    C obj = new C();
    obj.add();
    obj.mul();
    }
}
