package Day12InnerClasses;
class A{
    public void show(){
        System.out.println("Show of A ");
    }

    class B{
        public void show(){
            System.out.println("Show of B");
        }
    }

    static class C{
        public void show(){
            System.out.println("Shoiw of C");
        }
    }
}
public class InnerClasses
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.show();
        A.C obj2 = new A.C();


    }

}
