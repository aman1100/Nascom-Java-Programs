import java.util.Arrays;
public class Sample18
{
    public static void main(String[] args)
    {
        String s= new String ("sfserffa");
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        String b= new String(arr);
        System.out.println(b);
    }
}