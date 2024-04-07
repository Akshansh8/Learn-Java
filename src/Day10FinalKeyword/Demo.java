package Day10FinalKeyword;
class FinalDemo{
    final int a = 1;

    final int count;

    final static int slay;

    final int b;

    FinalDemo(){
        b = 5;
    }

    FinalDemo(int p){
        b = p;
    }

    {
        count = 1;

    }
    static {
        slay= 4;
        System.out.println("static block");
    }
}
public class Demo {
    public static void main(String[] args) {

    }
}
