import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sample16 extends Thread
 {
     public synchronized void removeElement(ArrayList<Integer> arr)
     {
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            Integer n=(Integer)o;
            if(n==5)
            {
                itr.remove();
            }
            
        }
        
         displayList(arr);
     }
     public  void displayList(ArrayList<Integer> arr)
     {
        System.out.println(arr);
     }
     public void run()
     {
        Integer[] arr={5,7,6,5,5,5,9,3,4};
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i:arr)
        {
            al.add(i);
        }
       
        removeElement(al);
        
     }
     
     public static void main(String[] args) 
    {
        Sample16 s1=new Sample16();
        Sample16 s2=new Sample16();
        Sample16 s3=new Sample16();
        s1.start();
        s2.start();
        s3.start();
    }
}
//Notes::
//Exception in thread "Thread-0" java.lang.UnsupportedOperationException
// bacause i used aslist method to convert array to list which throws this exception during threading
//Exception in thread "Thread-0" java.lang.ConcurrentModificationException
//because you cannot modify with for loop an arraylist during threading like remove add
// we have to use iterator with the help of iterator you can modify your arraylist
