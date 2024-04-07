class Bike{
    public void engine(){
        System.out.println("I have 2 stroke general engine");
    }

    public void printDetails(Bike ref){
        ref.engine();
    }
}

class Yamaha extends Bike{
    @Override
    public void engine(){
        System.out.println("I have 2 stroke yamaha engine");
    }
}

class Honda extends Bike{
    @Override
    public void engine(){
        System.out.println("I have 2 stroke honda engine");
    }
}
public class ObjectDowncasting {
    public static void main(String[] args) {
     Yamaha y= new Yamaha();
     Honda h = new Honda();
     Bike b = new Bike();
     b.printDetails(y);
        b.printDetails(h);
    }
}
