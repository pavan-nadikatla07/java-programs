import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatChar {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=scan.next();
        HashSet<Character> s=new HashSet<Character>();
        char result='\u0000';
        for(int i=0;i<str.length();i++)
        {
            if(s.contains(str.charAt(i)))
            {
                result=str.charAt(i);
                break;
            }
            else
                s.add(str.charAt(i));

        }
        System.out.println("first repeated letter is "+result);
        
       
    }
    
}
