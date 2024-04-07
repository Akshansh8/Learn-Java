package Day11StaticKeyword;

public class Demo {
    static int a ;
    static final int b;

    static {
        System.out.println(
                "lwde ke baal"
        );

        a = 10;
        b= 20;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
