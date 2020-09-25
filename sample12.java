import java.util.*;
public class sample12 {
    public static void main(String[] args)
    {
        TreeMap hm=new TreeMap<>(); // follow order indexing wont follow duplicates
        hm.put(109, "Acon");
        hm.put(102,"Bcon");
        hm.put(103,"Ccon");
        hm.put(104,"Dcon");
        hm.put(105,"Econ");
        hm.put(106,"Fcon");
        hm.put(1,"Zcon");
        hm.put(1,"Fcon");
        Set s= hm.keySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            System.out.println(o + " ===" + hm.get(o));
        }
        
    }
}
