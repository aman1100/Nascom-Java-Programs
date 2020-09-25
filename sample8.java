import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class sample8 {

    public static void getData(LinkedHashSet<Bank> bankHashSet) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.println("enter data");
            Bank b = new Bank();
            b.setAccid(sc.nextInt());
            sc.nextLine();
            b.setAccName(sc.nextLine());
            b.setAccBal(sc.nextInt());

            boolean exist = alreadyExist(bankHashSet, b);
            if (!exist)
                bankHashSet.add(b);
            sc.nextLine();
            System.out.println("Do you want to continue?");
            str = sc.nextLine();
        } while (str.equals("y"));
        sc.close();
    }

    public static boolean alreadyExist(LinkedHashSet<Bank> bankHashSet, Bank b) {
        for (Bank bank : bankHashSet) {
            if (bank.getAccid() == b.getAccid()) {
                System.out.println("Acc Id already exists");
                return true;
            }
        }
        return false;
    }

    public static void display(LinkedHashSet<Bank> bankHashSet) {
        for (Bank b : bankHashSet) {
            System.out.println(b.getAccid() + " --- " + b.getAccName() + " - " + b.getAccBal());
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Bank> bankHashSet = new LinkedHashSet<>();
        getData(bankHashSet);
        display(bankHashSet);
    }
}
