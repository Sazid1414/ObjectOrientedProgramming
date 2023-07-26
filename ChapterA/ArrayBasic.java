package ChapterA;

public class ArrayBasic {
    public static void main(String[] args) {
        //Initializing Array: datatype[] reference veriable=new datatype[size]
        //or dataType[] referemce variable={elements}
        int[] arr = new int[5];
        //if we don't give any values by default it is initialized by 0
        System.out.println(arr[0]);
        //In String array it is initialized by NULL
        String[] name = new String[5];
        System.out.println(name[0]);
        //In boolean array it is initialized by false
        boolean[] array = new boolean[2];
        System.out.println(array[0]);
        //Null is not a data type . it is a special value it is like a literal.it is a by default value what non primietives by default points to
        //we can initialize non primtives by null
        name[1] = null;
        System.out.println(name[1]);
        //But we can't initialize non primitives by null
        //int n=null;//we can't do that
        //objects are stored in heap memory . In stack reference variables are stored .if each
        // Element of an array is an object it will be stored in other memory .By default for every reference variables is initialized by null


    }
}
