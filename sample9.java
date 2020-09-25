import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;  


public class sample9 {
    

    public static void selectOption(ArrayList arr)
    {
        System.out.println("1.Delete by Account id " + "\n" + "2. Delete By Acc name" + "\n" + "3. Delete By Acc Ids" + "\n" + "4. Delete By Acc bal range" +"\n" + "5.exit");
        System.out.println("enter option");
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        switch (i) {
            case 1:
                    deleteByAccid(arr);
                
                break;
            case 2:
                deleteByAccName(arr);
            
            break; 
            case 3:
            deleteByAccIds(arr);
        
            break;
            case 4:
                    deleteByBalanceRange(arr);
                
                break;
            case 5:
                exit();
            
            break;
            default:
                break;
        }
    }
    public static void deleteByAccid(ArrayList<Bank> arr)
    {
        System.out.println("Enter account id");
        Scanner scanner=new Scanner(System.in);
        int acid=scanner.nextInt();
        System.out.println("Entered acid is:"+acid);

        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            Bank b=(Bank)o;
            if(b.getAccid() == acid)
            {
                System.out.println("are you sure :(y/n)");
                char s=scanner.next().charAt(0);
                System.out.println(s);
                if(s == 'y')
                {
                arr.remove(b);
                System.out.println("Id Removed");
                break;
                }
                else
                {
                    System.out.println("Id not removed");
                }
                
            }
            

        }
        display(arr);
        
        
    }
    public static void deleteByAccName(ArrayList arr)
    {
        System.out.println("Enter account Name");
        Scanner scanner=new Scanner(System.in);
        String acname=scanner.nextLine();
        System.out.println("Entered acName is:"+acname);

        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            Bank b=(Bank)o;
            if(b.getAccName().equals(acname))
            {
                System.out.println("are you sure :(y/n)");
                char s=scanner.next().charAt(0);
                if(s == 'y')
                {
                arr.remove(b);
                System.out.println("Id Removed");
                break;
                }
                else
                {
                    System.out.println("Id not removed");
                }
                
            }
           

        }
        display(arr);
        
    }
    public static void deleteByAccIds(ArrayList arr)
    {
        System.out.println("Enter Account ids");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        String[] svalues=str.split(",");
        Integer[] values=new Integer[svalues.length];
        int i=0;
        for(String s:svalues)
        {
                values[i]=Integer.parseInt(s.trim());
                i++;
        }
        for( i=0;i<values.length;i++)
        {
            Iterator itr=arr.iterator();
            while(itr.hasNext())
            {
                Object o= itr.next();
                Bank b=(Bank)o;
                if(b.getAccid() == values[i])
                {   
                    System.out.println("Id is:" + values[i]);
                     System.out.println("are you sure :(y/n)");
                     char s=scanner.next().charAt(0);
                     System.out.println(s);
                     if(s == 'y')
                        {
                            arr.remove(b);
                            System.out.println("Id Removed");
                            break;
                        }
                        else
                        {
                            System.out.println("Id not removed");
                        }
                
                 }
            }
        }
        display(arr);

    }
    public static void deleteByBalanceRange(ArrayList arr)
    {
        System.out.println("Enter balance range");
        Scanner scanner=new Scanner(System.in);
        int range=scanner.nextInt();

        for(int i=0;i<arr.size();i++)
    
        {
            Object o= arr.get(i);
            Bank b=(Bank) o;
            if(b.getAccBal() < range)
            {
                arr.remove(b);
                System.out.println(b.getAccid()+ " " + b.getAccName() + " " + b.getAccBal());
            }
        }
        // Iterator itr=arr.iterator();
        // while(itr.hasNext())
        // {
        //     Object o=itr.next();
        //     Bank b=(Bank) o;
        //     if(b.getAccBal() < range)
        //     {
        //         arr.remove(b);
        //         System.out.println(b.getAccid()+ " " + b.getAccName() + " " + b.getAccBal());
        //     }
        // }
    }
    public static void exit(){
        System.exit(0);
    }
    public static void display(ArrayList arr)
    {
        
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            Object o=itr.next();
            Bank b=(Bank)o;
            System.out.println(b.getAccid() + " " +b.getAccName() + " " +b.getAccBal());
        }
        
    }
    public static void main(String[] args)
    {
        ArrayList<Bank> ar=new ArrayList<Bank>();
        Bank b1=new Bank();
        Bank b2=new Bank();
        Bank b3=new Bank();
        Bank b4=new Bank();
        Bank b5=new Bank();
        b1.setAccid(101);b1.setAccName("surya");b1.setAccBal(500);
        b2.setAccid(102);b2.setAccName("satya");b2.setAccBal(2500);
        b3.setAccid(103);b3.setAccName("Tiwari");b3.setAccBal(3456);
        b4.setAccid(104);b4.setAccName("Priya");b4.setAccBal(1122);
        b5.setAccid(105);b5.setAccName("Akhil");b5.setAccBal(2341);
        ar.add(b1);ar.add(b2);ar.add(b3);ar.add(b4);ar.add(b5);

        selectOption(ar);

    }

    
}