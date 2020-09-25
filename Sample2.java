import java.util.*;
public class Sample2 {
    public static void main(String[] args)
    {

    
    ArrayList al=new ArrayList();
    al.add(100);
    al.add("time");
    al.add(true);
    al.add("Aman");
    System.out.println(al);
    System.out.println(al.get(0));
    System.out.println(al.remove(3));
    System.out.println(al);
    al.add("Rock");
    System.out.println(al);
    al.add(0,"true");
    System.out.println(al);
    al.add(35);
    al.add("surya");
    al.add("satya");
    al.add("auraj");
    al.add("suraj");
    
    for(int i=0;i<al.size();i++)
    {
        Object o= al.get(i);
        // if(o instanceof Integer)
        // {
        //     Integer n= (Integer)o;
        //     if(n%2 !=0)
        //     {
        //         System.out.println(n);
        //     }
        // }
        if(o instanceof String)
        {
            if(o.toString().startsWith("su"))
            {
                System.out.println(o);
            }
        }
    }

}
}