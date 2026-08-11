import java.util.*;
class exampleLinkedHM
{
  public static void main(String args[])
  {
   Scanner scan=new Scanner(System.in);
   System.out.println("enter no of departments");
   int n=scan.nextInt();
   System.out.println("enter departments and faculty names");
   LinkedHashMap<String,String> hash =new LinkedHashMap<>();
   for(int i=0;i<n;i++)
   {
      String dname=scan.next();
      String fname=scan.next();
      hash.put(dname,fname);
   }
   Set<String> s=hash.keySet();
   System.out.println("depart-name   faculty-name\n");
   for(String k:s)
   {
     System.out.println(k+"  "+hash.get(k));
   }
  }
}