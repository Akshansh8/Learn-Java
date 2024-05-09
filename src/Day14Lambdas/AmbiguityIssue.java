package Day14Lambdas;
interface A{
//    void show();

    default void show(){
        System.out.println("in A show");
    }
}

interface B{
//    void show();
    default void show(){
        System.out.println("in B show");
    }
}

class AB implements A,B{
    public void show(){
        B.super.show();
        A.super.show();
    }

}
public class AmbiguityIssue {
    public static void main(String[] args) {
        AB obj = new AB();
        obj.show(); // ambiguity issue on which show to call


    }
}
