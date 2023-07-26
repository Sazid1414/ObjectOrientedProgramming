package ChapterA;

import java.util.Arrays;

public class PassingArrayIntoFunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //pass by reference :
        //arr ref variable in stack memory is pointing to object in heap memory.Arrays are mutable is java
        //mutable means we can change the object
        //changing the arr[0] object
        function(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void function(int[]arr)
    {
        arr[0]=100;
    }
}
