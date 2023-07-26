package ChapterA;

import java.util.Arrays;

public class twoDimentionnalArray {
    public static void main(String[] args) {
        /*
            1  2  3  4
            5  6  7  8
            9 10 11 12
            data type[][]reference variable=new  datatype[Row Size(mandatory)][Column Size(Not mandatory in java)]
            we can think it like arrays of array . think like
            in 2d array the 0 th index is an array the 1st index is an array  so on.
            if we do arr[1]=[5,6,7,8]
            arr[1][0]->5
         */
        int[][] arr=new int[3][];
        //The above Syntax is valid in java
        int[][] arr2D={
                            {1,2,3},//oth index
                            {4,5},//1st index
                            {6,7,8,9}//2nd index-> arr2D[2] = {6,7,8,9}
                        };
        //Above one is valid
        System.out.println(Arrays.toString(arr2D[2]));
        //But this is not valid
     //   System.out.println(Arrays.toString(arr2D));
        //in 2D array if we do like Array name . length it will print"Number of Row"
        System.out.println(arr2D.length);//Prints number of columns

    }
}
