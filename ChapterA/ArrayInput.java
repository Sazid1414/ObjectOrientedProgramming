package ChapterA;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[4]=5;
        System.out.println(arr[2]);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //array.length prints the lengths of array or sizeof array
        //For each loop : for(dataType variable name :arrayname)
        for(int num:arr)
        {
            System.out.println(num);//here num represents elements of the array
        }
        //Another way to print the String is to using toString method of arrayClass
        //It converts the array into String
        System.out.println(Arrays.toString(arr));
    }
}
