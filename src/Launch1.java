class Plane{
    public void takeoff(){
        System.out.println("Taking off");
    }
    public void landing(){
        System.out.println("Landing ");
    }

}

class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("Cargo Taking off");
    }
    public void landing(){
        System.out.println(" Cargo Landing ");
    }

    public void carryGoods(){
        System.out.println("yes i carry goods");
    }
}

class Animal{
//    public int eat(){
//        return 1;
//    }

    public Plane eat(){
        System.out.println("Plane type");
        Plane p = new Plane();
        return p;
    }
}

class Tiger extends Animal{
//    public short eat(){
//
//    }

    public CargoPlane eat(){
        System.out.println("CargoPlane typr");
        CargoPlane cp = new CargoPlane();
        return cp;
    }
}
public class Launch1 {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();
        cp.landing();
        cp.takeoff();
        ((CargoPlane) cp).carryGoods();
    }
}
