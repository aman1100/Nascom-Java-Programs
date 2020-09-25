import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample6 {
    public static void main(String[] args)
    {
        LinkedHashSet ls=new LinkedHashSet(); // follow order concept of index as well as  wont follow duplicate elements
        ls.add(100);
        ls.add("true");
        ls.add(true);
        ls.add(100);
        ls.add(1);
        Iterator itr=ls.iterator();
        while(itr.hasNext())
        {
            Object o= itr.next();
            System.out.println(o);
        }
    }
    
}