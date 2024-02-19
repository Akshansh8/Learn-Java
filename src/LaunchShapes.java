import java.util.Scanner;

abstract class Shapes{
    float area;
    abstract void input();
    abstract void compute();

    public float display(){
        return area;
    }
}

class Rectangle extends Shapes{
    float len;
    float width;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter len and width of rectangle");
        len = sc.nextFloat();
        width = sc.nextFloat();
    }

    void compute(){
        area = len * width;
        System.out.println("Area of rectangle is "+ display());
    }
}
class Square extends Shapes{
    float len;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter len and width of rectangle");
        len = sc.nextFloat();

    }

    void compute(){
        area = len * len;
        System.out.println("Area of rectangle is "+ display());
    }
}
class Circle extends Shapes{
    float rd;
    final float PI = 3.14f;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter len and width of rectangle");
        rd = sc.nextFloat();

    }

    void compute(){
        area = PI * rd * rd;
        System.out.println("Area of rectangle is "+ display());
    }
}
class Calculate{
    public void calc(Shapes sp){
        sp.input();
        sp.compute();
    }
}
public class LaunchShapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        Calculate cl = new Calculate();
        cl.calc(r);
        cl.calc(s);
        cl.calc(c);

    }
}

