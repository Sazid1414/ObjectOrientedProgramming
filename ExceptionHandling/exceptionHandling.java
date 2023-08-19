package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continueLoop=true;
       do {
           try
           {
               System.out.println("Enter an integer numerator:");
               int numerator=sc.nextInt();
               System.out.println("Enter an integer Denominator:");
               int denominator= sc.nextInt();
               int result=quotient(numerator,denominator);
               System.out.println("\rResult:"+result);
               continueLoop=false;
           }
           catch (InputMismatchException inputMismatchException)
           {
               System.err.println("Exception"+inputMismatchException);
               System.out.println("You must enter Integer:");

           }
           catch (ArithmeticException arithmeticException)
           {
               System.out.println("Exception"+arithmeticException);
               System.out.println("Zero is invalid denominator.");
           }
       }while (continueLoop);

    }
    public  static int quotient(int numerator,int denominator)
        throws ArithmeticException
        {
            return numerator / denominator;
        }


}
