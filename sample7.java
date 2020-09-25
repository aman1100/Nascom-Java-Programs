import java.util.Iterator;
import java.util.TreeSet;

public class sample7 {
    public static void main(String[] args)
    {
        TreeSet ts=new TreeSet<>();//accept homogeneous objects dont allow duplicates and provide ascending order
        ts.add(100);
        ts.add(3);
        ts.add(400);
        ts.add(150);
        ts.add(0);
        ts.add(120);
        ts.add(200);
        Iterator itr=ts.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            System.out.println(o);
        }
    }
}