package OOPMIDPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandeling {
    public static int quotient(int numerator,int denominator)
    throws ArithmeticException
    {
        return numerator/denominator;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator:");
            int numerator = sc.nextInt();
            System.out.println("Enter denominator:");
            int denominator = sc.nextInt();
            int result = quotient(numerator, denominator);
            System.out.println("result:" + result);//This statement will not exicuted if exception occurs
        }
        catch (ArithmeticException arithmeticException)
        {
            System.err.println("Exception Divided by zero");
        }
        catch (InputMismatchException inputMismatchException)
        {
           System.err.println("Input mismatch Exception");
        }
    }
}
