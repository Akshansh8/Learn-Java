package Day15ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner s =  new Scanner(System.in);
            int num = s.nextInt();
            int den = s.nextInt();
            int res = num/den;
            System.out.println(res);
            int n = s.nextInt();
            int[] arr = new int[n];


            System.out.println(Arrays.toString(arr));


        }
        //multiple catch blocks for multiple exceptions

        catch(ArithmeticException e){
            System.out.println("denominator can't be zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bounds");
        }
        //any other exception which i don't know
        catch (Exception e){
            System.out.println(e);

        }
    }
}
