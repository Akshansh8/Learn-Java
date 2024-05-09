package Day14Lambdas;
@FunctionalInterface
interface Phone{
//    int square(int num);

    int add(int num1, int num2);
}
public class LambdaDemo2 {
    public static void doSomething(Phone p1){

    }
    public static void main(String[] args) {
//        Phone p = (int num) -> {
//            return num * num;
//        };

        Phone p1 = (num1, num2) ->  num1 + num2;
        int res = p1.add(8,9);
        System.out.println(res);
        doSomething(p1);
    }
}
