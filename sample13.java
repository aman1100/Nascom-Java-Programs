import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class sample13 {
    public static void check(Character c)
    {
        do{
            System.out.println("Enter id");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Enter value");
        String s=scanner.nextLine();
        if(s.length()>5  )
        {
            create(n,s);
        }
        }
        while( c=='y');        
        
    }
    public static void create(int p,String q)
    {
        HashMap hmp=new HashMap<>();
        hmp.put(p, q);
        Set s=hmp.keySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            System.out.println(o + "  " + hmp.get(o));
        }
        System.out.println("Do you want to continue (y/n)");
        Scanner scanner=new Scanner(System.in);
        char chr=scanner.next().charAt(0);
        if(chr == 'y')
        {
            check('y');
        }
        else 
        {
            System.exit(0);
        }
        
    }
    public static void main(String[] args)
    {   
        
       check('y');
        
    }
}