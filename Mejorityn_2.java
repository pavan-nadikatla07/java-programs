import java.util.*;
public class Mejorityn_2 {
     static int mejority_2(int a[])
    {
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<a.length;i++)
      {
        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
      }
      Set<Integer> s=hm.keySet();
    for(int j:s)
    {
        if(hm.getOrDefault(j,0)>a.length/2)
              return j;
        
    }
    return -1;
}
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in array :");
        int n=scan.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=scan.nextInt();
        }
        System.out.println("mejority is :"+Mejorityn_2.mejority_2(a));
     
    }
    
 }
    
    
    

