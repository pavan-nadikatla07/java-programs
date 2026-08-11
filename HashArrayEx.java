import java.util.*;
class HashArrayEx
{
  public static void main(String arge[])
{
   Scanner scan=new Scanner(System.in);
   System.out.println("enter no of students");
   int n=scan.nextInt();
   HashMap<String,ArrayList<Integer>> hm=new HashMap<>();
   for(int i=0;i<n;i++)
{
    System.out.println("enter the student name");
    String name=scan.next();
    System.out.println("enter marks of the student");

    hm.put(name,new ArrayList<Integer>());
  for(int j=0;j<6;j++)
   { 
     int num=scan.nextInt();
      hm.get(name).add(num);
   }
    
}
  Set<String> s=hm.keySet();
  int max=-1;
  String g="";
  for(String x:s)
{
  ArrayList<Integer> res=hm.get(x);
  int total=0,avg=0;
  String gr="";
  for(int k=0;k<6;k++)
  {
    total=total+res.get(k);
  }
  if(total/6<35||res.get(0)<35||res.get(1)<35||res.get(2)<35||res.get(3)<35||res.get(4)<35||res.get(5)<35)
    gr="FAIL";
  else if(total/6>90)
      gr="S";
  else if(total/6>80)
      gr="A";
  else if(total/6>70)
      gr="B";
  else if(total/6>60)
      gr="C";
  else if(total/6>50)
      gr="D";
  else 
      gr="E";
  
  if(total>max){
     max=total;
     g=x;
   }
   System.out.println(x+" :total: "+total+" average: "+(total/6)+" grade: "+gr);
 
}
  System.out.println(g+" got the maximum marks of "+max);
}
}