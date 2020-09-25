

class Singleton
{
    private static Singleton single=null;
    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        if( single == null)
        {
            single = new Singleton();
        }
        return single;
    }
}
public class object  {
    public static void main(String[] args)
    {
        Singleton instance1= Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 + " " + instance2);
        
    }
    
}