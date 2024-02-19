
class Demo4{
    public static  void disp4(){
        System.out.println("static method of parent class");
    }
}

class Demo5{
//    @Override
    public static void disp4(){
        System.out.println("static method of chid class");
    }
}
public class Launch5 {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
        d.disp4();
    }
}
