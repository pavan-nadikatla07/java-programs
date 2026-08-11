import java.util.*;
class exampleLinkedHM3
{
  public static void main(String args[])
  {
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the size of the array");
   int n=scan.nextInt();
   System.out.println("enter the String elements");
   LinkedHashMap<String,Integer> hash =new LinkedHashMap<>();
   String[] str=new String[n];
   for(int i=0;i<n;i++)
   { 
      str[i]=scan.next();
   }
   for(int i=0;i<n;i++)
   { 
      String element=str[i];;
      int frequency;
      if(hash.containsKey(element))
          hash.put(element,hash.get(element)+1);
      else
          hash.put(element,1);
      
   }
   Set<String> s=hash.keySet();
   System.out.println("element   frequency");
   for(String k:s)
   {
     System.out.println(k+"  "+hash.get(k));
   }
  }
}