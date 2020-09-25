import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sample14 {
    public static HashMap getData(ArrayList<Integer> sno,ArrayList<String> sname,ArrayList<String> scity)
    {
        HashMap hm=new HashMap<>();
        System.out.println("enter City name");
        Scanner scanner=new Scanner(System.in);
        String cityName=scanner.nextLine();
        for(int i=0;i<scity.size();i++)
        {
            if(scity.get(i).equals(cityName))
            {
                hm.put(sno.get(i),sname.get(i));
            }
           
        }
        return hm;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> sno=new ArrayList<Integer>();
        ArrayList<String> sname=new ArrayList<String>();
        ArrayList<String> scity=new ArrayList<String>();
        sno.add(101);sno.add(102);sno.add(103);sno.add(104);sno.add(105);sno.add(106);
        sname.add("ram");sname.add("sam");sname.add("sai");sname.add("thomas");sname.add("jack");sname.add("feroz");
        scity.add("hyd");scity.add("pune");scity.add("pune");scity.add("ban");scity.add("hyd");scity.add("hyd");
        
        HashMap hmp = getData(sno, sname, scity);
        System.out.println(hmp);
    }
}