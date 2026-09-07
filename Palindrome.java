import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=scan.next();
        boolean b=true;
        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
        {
           if(str.charAt(i)!=str.charAt(j))
           {
             b=false;
           }
        }
        System.out.println("given string "+str+" is"+(b?"":" not ")+" a palindrome!!");
    }
    
}
