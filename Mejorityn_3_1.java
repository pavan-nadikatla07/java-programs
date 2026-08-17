import java.util.*;

public class Mejorityn_3_1 {
    static int mejority_3(int a[])
    {
      LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
      for(int i=0;i<a.length;i++)
      {
        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
      }
      Set<Integer> s=hm.keySet();
    for(int j:s)
    {
        if(hm.getOrDefault(j,0)>a.length/3)
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
        System.out.println("mejority is :"+Mejorityn_3_1.mejority_3(a));
     
    }
    
}
