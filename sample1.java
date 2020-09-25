
class sample1 {
     public static void main(String[] args) {
        try{
            int n1=100,n2=0;
            System.out.println(n1/n2);
        }
        catch(ArithmeticException e){
                System.out.println("exception");
        }
       
    }
}