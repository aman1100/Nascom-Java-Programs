import java.util.Scanner;

public class BankClient {
    public static void main(String[] args)
    {
        System.out.println("enter pin");
        int balance=2000;
        Scanner scanner=new Scanner(System.in);
        int pwd=scanner.nextInt();
        if(pwd == 1234)
        {
            System.out.println("enter amount :");
            int amt=scanner.nextInt();
            if(amt>balance)
            {
                try
                {
                    throw new BankException();
                }
                catch(BankException e){}
            }
            else{
                System.out.println("cash recieved");
            }
        }
        else{
            System.out.println("wrong pin");
        }
    }
}