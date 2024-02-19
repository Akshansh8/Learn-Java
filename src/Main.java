class Employee{
    String name;
    int age;
    int salary;
    Employee(){
        name ="sheru";
        age = 22;
        salary = 1500;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
    @Override
    public String toString(){
        return name+" "+age+" "+salary;
    }
}
public class Main {
    public static void main(String[] args) {
       Employee e = new Employee();
        System.out.println(e);
    }
}