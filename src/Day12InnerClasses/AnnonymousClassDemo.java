package Day12InnerClasses;

class Car{

    public void drive(){
        System.out.println("Driving");
    }
}

class SuperCar extends Car{

    public void drive(){
        System.out.println("Driving supercar");
    }

    public void show(){
        System.out.println("Show some speed");
    }
}

public class AnnonymousClassDemo {
    public static void main(String[] args) {
        Car obj = new SuperCar();
        //now i have only one method in this supercar so instead of creating a supercar class
        //create an anaonymous inner class for the same
       Car obj1 = new SuperCar(){
            public void drive(){
                System.out.println("Driving supercar");
            }


            public void show() {
                System.out.println("I have speed brother");
            }
        };
        obj1.drive();

//        obj.show(); can't call this because reference is of type car but there is no method shaow in car class it is in supercaer class
//you can have show inside anonymous inner class but not call them

    }
}
