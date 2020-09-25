import java.util.Scanner;

public class sample17 {
    public static void replacePlus(String p, String q)
    {
      p=p.toLowerCase();
      q=q.toLowerCase();
      StringBuilder sb=new StringBuilder();
      
      
    }
     public static void main(String[] args) {
       System.out.println("Enter 2 strings");
       Scanner scanner=new Scanner(System.in); 
       String str1= scanner.nextLine();
       String str2=scanner.nextLine();
       replacePlus(str1, str2);
       scanner.close();
    }
    
}
// Obtain two strings from user as input. Your program should modify the first string such that all the characters are replaced by plus sign (+) except the characters which are present in the second string.
// That is, if one or more characters of first string appear in second string, they will not be replaced by +.
// Return the modified string as output. Note - ignore case.
// Include a class UserMainCode with a static method replacePlus which accepts two string variables. The return type is the modified string.

// Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.

// Input and Output Format:
// Input consists of two strings with maximum size of 100 characters.

// Output consists of a single string.

// Refer sample output for formatting specifications.

// Sample Input 1:

// abcxyz
// axdef

// Sample Output 1:

// a++ x++