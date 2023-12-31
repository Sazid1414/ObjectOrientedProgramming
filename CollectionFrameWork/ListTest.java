package CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    private static final String colors[]={"black","yellow","green","blue","violet","silver"};
    private static final String colors2[]={"gold","white","brown","blue","gray","silver"};
    public ListTest()
    {
        List<String>list1=new LinkedList<String>();
        List<String>list2=new LinkedList<String>();
        for(String color:colors)
        {
            list1.add(color);
        }
        for(String color:colors2)
        {
            list1.add(color);
        }
        list1.addAll(list2);
        list2=null;
        printList(list1);
        convertToUppercaseStrings(list1);
        printList(list1);
        System.out.println("Deleting elements 4 to 6....");
        removeItems(list1,4,7);
        printList(list1);
        printReversedList(list1);
    }
    public void printList(List<String>list)
    {
        System.out.println("List ");
        for(String color:list)
        {
            System.out.println(color);
        }
        System.out.println();
    }
    private void convertToUppercaseStrings(List<String>list)
    {
        ListIterator<String>iterator= list.listIterator();
        while (iterator.hasNext())
        {
            String color=iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
    private void removeItems(List<String>list,int start,int end)
    {
        list.subList(start,end).clear();
    }
    private void printReversedList(List<String>list)
    {
        ListIterator<String>iterator= list.listIterator(list.size());
        System.out.println("Reversed List ");
        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }

    public static void main(String[] args) {
        new ListTest();
    }

}
