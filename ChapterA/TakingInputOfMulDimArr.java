package ChapterA;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInputOfMulDimArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array2D[][]=new int[3][2];
        //Input array
        for(int row=0;row< array2D.length;row++)
        {
            for(int column=0;column<array2D[row].length;column++)
            {
                array2D[row][column]=sc.nextInt();
            }
        }
        //OutPut
        //complexity O(n^2)
        for(int row=0;row< array2D.length;row++)
        {
            for(int column=0;column<array2D[row].length;column++)
            {
                System.out.print(array2D[row][column]+" ");
            }
            System.out.println();
        }
        //compexity O(n)
        for(int row=0;row<array2D.length;row++)
        {
            System.out.println(Arrays.toString(array2D[row]));
        }
        //For each loop
        //for(data type Variable: array name) sout(variablename)
        for(int[] a:array2D)
        {
            System.out.println(Arrays.toString(a));
        }



    }
}
