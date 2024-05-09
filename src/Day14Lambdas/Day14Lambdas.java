package Day14Lambdas;

interface Calc{
    void show();

}
public class Day14Lambdas {
    public static void main(String[] args) {
//        Calc obj = new Calc() {
//            @Override
//            public void show() {
//                System.out.println("showing annonymously");
//            }
//
//        };
        Calc obj = () -> System.out.println("in show"); //works only with functional interface or SAM
obj.show();


    }
}
