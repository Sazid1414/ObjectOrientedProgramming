package ChapterA;

import java.util.Arrays;
import java.util.Scanner;

public class SomeArrayOperation {
    public static void main(String[] args) {
        //The object is created in the heap memory& the ref.variable in the stack memory
        String[] str=new String[4];
        //Alt+shift+enter=imports class
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.next();

        }
        //Array class toString method
        System.out.println(Arrays.toString(str));


    }
}
