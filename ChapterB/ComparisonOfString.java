package ChapterB;

public class ComparisonOfString {
    public static void main(String[] args) {
        String a="sazid";
        String b="sazid";
        //== method is a comperator
        //if a==b gives us false then different object is creating
        //if a==b gives true then both are pointing to string pool

        System.out.println(a==b);
        //How to create a& b different object or creating a new object for same string
        String name1=new String("Sazid");
        String name2=new String("Sazid");
        //now for same string sazid 2 different object is created so now name1==name2 will print false
        System.out.println(name1==name2);
        //When we only need to check value use .equals method
        //We will do like this when we are checking password
        System.out.println(name1.equals(name2));

    }
}
