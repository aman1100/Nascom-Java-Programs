import java.util.HashSet;
import java.util.Iterator;

public class Sample5 {
    
    public static void main(String[] args)
    {
        HashSet hs=new HashSet(); //dont follow order no concept of index as well as hashset wont follow duplicate elements
        hs.add(100);
        hs.add("true");
        hs.add(true);
        hs.add(100);
        hs.add(1);
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            Object o= itr.next();
            System.out.println(o);
        }
   
   
   
    }
    
}