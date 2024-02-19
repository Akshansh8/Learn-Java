class koda{
    static int b;
    static {
        b = 20;
        System.out.println(b);
    }
}
public class Launch4 {
    Launch4(){
        System.out.println("construvtor");
    }
    static int a;
    static {
        a = 10;
        System.out.println(a+"non static initializtion block");
    }
    public static void main(String[] args) {

        System.out.println("main block");
    }
}
