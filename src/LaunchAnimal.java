abstract class Animal1{
    abstract  void eat();

    abstract void running();

}

class Cat extends Animal1{
    public void eat(){
        System.out.println("cat is eating");
    }
    public void running(){
        System.out.println("cat is running");
    }
}
class Forest{
    public void permit(Animal1 ref){
        ref.eat();
        ref.running();
    }
}
public class LaunchAnimal {
    public static void main(String[] args) {
        Cat c = new Cat();
        Forest a = new Forest();
        a.permit(c);
    }
}
