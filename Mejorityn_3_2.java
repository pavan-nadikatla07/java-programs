import java.util.*;

public class Mejorityn_3_2 {
    static ArrayList mejority_3_2(int a[])
    {
      LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
      for(int i=0;i<a.length;i++)
      {
        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
      }
      Set<Integer> s=hm.keySet();
      ArrayList<Integer> arr=new ArrayList<>();
    for(int j:s)
    {
        if(hm.getOrDefault(j,0)>a.length/3)
              arr.add(j);
        
    }
    return arr;
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
        ArrayList<Integer> ar=Mejorityn_3_2.mejority_3_2(a);
        System.out.println("mejority is :"+((ar.size())>0?ar:-1));
     
    }
    
}
