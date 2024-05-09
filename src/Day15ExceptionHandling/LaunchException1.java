package Day15ExceptionHandling;

import java.util.Scanner;

class InvalidCustomerException extends Exception{

    public InvalidCustomerException(String  msg){
        super(msg);
    }

}
class ATM  {
    private int accNum = 1221;
    private int pin = 9807;

    int userac;
    int userpin;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your account number");
        userac = sc.nextInt();
        System.out.println("please enterf your pin");
        userpin = sc.nextInt();

    }

    public void verify() throws InvalidCustomerException {
        if(accNum == userac && pin == userpin){
            System.out.println("Collect your cash");
        }

        else{
            InvalidCustomerException ice = new InvalidCustomerException("Invalid credentials! Try again");

            System.out.println(ice.getMessage());
            throw ice;
        }
    }
}

class Bank{
    public void initiate(){
        ATM at = new ATM();
        try {
            at.input();
            at.verify();
        }
        catch(InvalidCustomerException ice){
            try {
                at.input();
                at.verify();
            }
            catch(InvalidCustomerException ic){
                try {
                    at.input();
                    at.verify();
                }
                catch(InvalidCustomerException i){
                    System.out.println("Card is blocked");                }
            }
        }
    }
}

public class LaunchException1 {
    public static void main(String[] args) {
           Bank b = new Bank();
           b.initiate();
    }
}
