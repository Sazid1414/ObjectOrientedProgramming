package CollectionFrameWork;
import  java.util.*;
import java.util.Arrays;

    public class UsingArrays {
        private int intArray[] = {1, 2, 3, 4, 5, 6};
        private double doubleArray[] = {8.4, 9.3, 0.2, 7.9, 3.4};
        private int filledIntArray[];
        private int  intArrayCopy[];
        public UsingArrays() {
            filledIntArray = new int[10];
            intArray = new int[intArray.length];
            Arrays.fill(filledIntArray, 7);
            Arrays.sort(doubleArray);
            System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        }

        public void printArrays() {
            System.out.println("Double Array ");
            for (double doubleValue : doubleArray) {
                System.out.println(doubleValue);
            }
            System.out.println("IntArray");
            for (int intValue : intArray) {
                System.out.println(intValue);
            }
            System.out.println("FilledIntArray");
            for (int intValue : filledIntArray) {
                System.out.println(intValue);
            }
            System.out.println("IntArrayCopy");
            for (int intValue : intArrayCopy) {
                System.out.println(intValue);
            }
        }

        public int searchForInt(int value) {
            return Arrays.binarySearch(intArray, value);
        }

        public void printEquality() {
            boolean b = Arrays.equals(intArray, intArrayCopy);
            b = Arrays.equals(intArray, intArrayCopy);
        }


        public static void main(String[] args) {
            UsingArrays usingArrays = new UsingArrays();
            usingArrays.printArrays();
            usingArrays.printEquality();
            int location= usingArrays.searchForInt(5);
            if(location>=0)
            {
                System.out.println("Found 5 at element at"+location);
            }
            else {
                System.out.println("5 not found in the array.");
            }
            location=usingArrays.searchForInt(87);
                    if(location>=0)
                    {
                        System.out.println("Found 87 at "+location);
                    }
                    else{
                        System.out.println("87 not found");
                    }
        }
    }


