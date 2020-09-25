import java.util.ArrayList;
import java.util.Collections;

public class sample3 {

    public static ArrayList duplicate(ArrayList bl)
    {
        ArrayList cl=new ArrayList<>();
        cl.clear();
        for(int i=0;i<bl.size();i++)
        {
            Object o=bl.get(i);
            if(o instanceof Integer)
            {
                Integer n=(Integer)o;
                if(Collections.frequency(bl,n)>1 && !cl.contains(n) )
                {
                    cl.add(n);
                }
            }
        }
        System.out.println(" Duplicates are:");
        return cl;
    }
    public static ArrayList removeduplicate(ArrayList bl)
    {
        ArrayList cl=new ArrayList<>();
        cl.clear();
        for(int i=0;i<bl.size();i++)
        {
            Object o=bl.get(i);
            if(o instanceof Integer)
            {
                Integer n=(Integer)o;
                if(Collections.frequency(bl,n)==1 )
                {
                    cl.add(n);
                }
            }
        }
        System.out.println("non Duplicates are:");
        return cl;
    }
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(67);
        al.add(100);
        al.add(67);
        al.add(4);
        ArrayList dl=removeduplicate(al);
        ArrayList el=duplicate(al);
        System.out.println(dl);
        System.out.println(el);
    }
}