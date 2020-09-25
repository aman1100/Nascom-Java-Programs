import java.util.ArrayList;
import java.util.Scanner;

public class Sample15 extends Thread

 {
     ArrayList<Integer> al=new ArrayList<Integer>();
    public void add(Integer x)
    {
        
        al.add(x);
        System.out.println(al);
    }
    public void remove( Integer x)
    {
        if(al.contains(x))
        {
            al.remove(x);

        }
        System.out.println(al);
    }
     public void run()
     {
         this.add(100);
         this.remove(100);
     }
         public static void main(String[] args) throws InterruptedException {// thread is a light weight component which perform unit of work
            // because different objects of thread class contains same memory allocation.
            Sample15 obj=new Sample15();
            Sample15 obj2=new Sample15();
            Sample15 obj3=new Sample15();
            // System.out.println(obj.getName());
            // System.out.println(obj.getId());
            // System.out.println(obj.getPriority());
            // obj.setName("New_Thread");
            // System.out.println(obj.getName());
            // System.out.println(obj.isAlive());
            // System.out.println(obj.getName());
            
            obj.start();
            obj.setName("t1");
            
            obj.join();
            obj2.start();
            obj2.setName("t2");
            obj3.setName("t3");
            obj3.start();
            
    }
    
}