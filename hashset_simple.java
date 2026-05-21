import java.util.*;
public class hashset_simple {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(6);
        System.out.println(set);

        if(set.contains(1))
        {
            System.out.println("set contains 1");
        }
        if(!set.contains(7))
        {
            System.out.println("set does not contains 7");
        }

        set.remove(1);
        System.out.println(set);

        if(!set.contains(1))
        {
            System.out.println("Does not contains 1");
        }

        System.out.println("size of set "+set.size());

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
}
