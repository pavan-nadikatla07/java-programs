import java.util.*;

public class FirstNonRepeated {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=scan.next();
        HashMap<Character,Integer> sm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            sm.put(str.charAt(i),sm.getOrDefault(str.charAt(i),0)+1);
        }
        char result='\u0000';
        for(char i:sm.keySet())
        {
            if(sm.get(i)==1)
            {
                result=i;
                break;
            }

            
        }
        System.out.println("first nonrepeated letter is "+(result!='\u0000'?result:'$'));
        
       
    }
    
}
