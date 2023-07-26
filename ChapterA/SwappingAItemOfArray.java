package ChapterA;

import java.util.Arrays;

public class SwappingAItemOfArray {
    public static void main(String[] args) {
       int[] array={1,2,3,4,5};
       swap(array,0,1);
        System.out.println(Arrays.toString(array));

    }
    static void swap(int[] arr,int startIndex,int EndIndex)
    {
        int temp=arr[startIndex];
        arr[startIndex]=arr[EndIndex];
        arr[EndIndex]=temp;
    }
}
