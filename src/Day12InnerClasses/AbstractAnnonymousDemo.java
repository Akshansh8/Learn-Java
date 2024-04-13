package Day12InnerClasses;


abstract class Bike{
    abstract void drive();
}
public class AbstractAnnonymousDemo {
    public static void main(String[] args) {
        Bike B = new Bike(){
            public void drive(){
                System.out.println("Heavy driver");
            }
        };
        B.drive();
    }
}
