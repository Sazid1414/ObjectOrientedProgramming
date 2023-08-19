package ChapterB;

public class StringBasic {
    public static void main(String[] args) {
        //When we are writing this String is a class in java
        //DataType reference variable =object of string
        //String name ="Sazid";
        String name="Sazidur Rahman Mahin";
        //What is like if we do this a="sazid" b="sazid" does a & b in the stack memory and sazid in the heap memory ? and a & b pointing to "sazid"
        //StringPool: String variable is stored in the stack memory & String is a separate memory in the heap memory
        //If we say like a="sazid" then b="sazid" it would be like hey  we have "sazid" in the pool so point b to the pool
        //In array we see that two or more variable pointing to same array
        //We can't change the object so strings are immutable
        System.out.println(name);
        String a="Sazid";
        String b="Sazid";
        System.out.println(a);
        a="Mahin";
        System.out.println(a);
        //In above example we can think that we have changed the object But no we have created a new object a is then reffering to new object Mahin


    }
}
