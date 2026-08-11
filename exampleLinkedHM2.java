import java.util.*;
class exampleLinkedHM2
{
  public static void main(String args[])
  {
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the size of the array");
   int n=scan.nextInt();
   System.out.println("enter the elements");
   LinkedHashMap<Integer,Integer> hash =new LinkedHashMap<>();
   for(int i=0;i<n;i++)
   { 
      int element=scan.nextInt();
      int frequency;
      if(hash.containsKey(element))
          hash.put(element,hash.get(element)+1);
      else
          hash.put(element,1);
      
   }
   Set<Integer> s=hash.keySet();
   System.out.println("element   frequency");
   for(int k:s)
   {
     System.out.println(k+"  "+hash.get(k));
   }
  }
}