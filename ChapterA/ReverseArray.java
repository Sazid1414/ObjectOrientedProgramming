package ChapterA;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int startIndex,int EndIndex)
    {
        int temp=arr[startIndex];
        arr[startIndex]=arr[EndIndex];
        arr[EndIndex]=temp;
    }
}

