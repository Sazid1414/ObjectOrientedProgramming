package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    private static final String[] colors={"Magenta","Red","White","Blue","Cyan"};
    private static final String[] removeColors={"Red","White","Blue"};
    public CollectionTest()
    {
        List<String>list=new ArrayList<String>();
        List<String>removeList=new ArrayList<String>();
        for(String color:colors)
        {
            list.add(color);
        }
        for(String color:removeList)
        {
            removeList.add(color);
        }
        System.out.println("ArrayList: ");
        for(int count=0;count<list.size();count++)
        {
            System.out.println(list.get(count));
        }
        removeColors(list,removeList);
        System.out.println("Arraylist after removeColors: ");
        for(String color:list)
        {
            System.out.println(color);
        }
    }
    private void removeColors(Collection<String>collection1,Collection<String>collection2)
    {
        Iterator<String>iterator=collection1.iterator();
        while(iterator.hasNext())
        {
            if(collection2.contains(iterator.next()))
            {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        new CollectionTest();
    }
}
