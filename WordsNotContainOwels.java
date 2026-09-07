import java.util.Scanner;

public class WordsNotContainOwels {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=scan.next();
        String[] s=str.split("#");
        String[] s1=new String[s.length];
        int count=0;
        for(String i:s)
        {
            boolean b=true;
            int j=0;
           while(j<i.length())
           {
             if(i.charAt(j)=='a'||i.charAt(j)=='e'||i.charAt(j)=='i'||i.charAt(j)=='o'||i.charAt(j)=='u'||i.charAt(j)=='A'||i.charAt(j)=='E'||i.charAt(j)=='I'||i.charAt(j)=='O'||i.charAt(j)=='U')
                b=false;
             j++;
           }
           if(b)
           {
            s1[count]=i;
            count++;
           }

        }
        for(int i=0;i<count;i++)
        {
             System.out.println(" "+s1[i]);
        }
       
    }
    
}
