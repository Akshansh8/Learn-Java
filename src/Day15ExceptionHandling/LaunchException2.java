package Day15ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
   public UnderAgeException(String msg){
       super(msg);
   }
}

class OverAgeException extends Exception
{
    public OverAgeException(String msg){
        super(msg);
    }

}

class Applicant
{
    int age;

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  your age");
        age = sc.nextInt();
    }
    public void verify() throws UnderAgeException, OverAgeException
    {
        if(age<18){
            UnderAgeException uae = new UnderAgeException("You are underage");
            System.out.println(uae.getMessage());
            throw uae;

        } else if (age>60) {
            OverAgeException oae = new OverAgeException("You are not allowed as per health guidelines");
            System.out.println(oae.getMessage());
            throw oae;

        }
        else{
            System.out.println("Congrats your eligible for driving");
        }
    }

}

class Test{
    public void initiate(){
        Applicant  a = new Applicant();
        try{
            a.input();
            a.verify();
        }
        catch (UnderAgeException | OverAgeException e){
            System.out.println("Abra ka dabra gilii gilli chu");
        }
    }
}
public class LaunchException2 {
    public static void main(String[] args) {
      Test t = new Test();
      t.initiate();


    }
}
