package ExceptionHandling;

import java.util.Scanner;

public class Assertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 0 to 10:");
        int number=sc.nextInt();
        assert(number>=0&&number<=10):"bad number: "+number;
        System.out.println("You Entered "+number);
        
    }
}
