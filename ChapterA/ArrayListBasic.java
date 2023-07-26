package ChapterA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {
        //Array list will use when we don't know the size
        //Syntax Arraylist<Integer> nameofList=new Arraylist<>();
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       // Generics means the type of data we can input in the list
      //  Wrapper Class : Integer String Float Double because in arraylist we can't write like int or float
        list.add(100);
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(10);
        list.add(0);
        list.add(10);
        System.out.println(list.contains(100));
        System.out.println(list);
        list.set(0,99);//0 th index will be replaced with 99
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        //add item on array list
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        //Get Item in any Index
        for(int i=0;i<5;i++)
        {
            System.out.print(list.get(i)+" ");
        }





    }

}
