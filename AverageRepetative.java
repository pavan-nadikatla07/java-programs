import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class AverageRepetative {
    static ArrayList repetative(int a[],int x)
    {
      LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
      for(int i=0;i<a.length;i++)
      {
        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
      }
      ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<a.length;i++)
    {
        int o=(x+a[i])/2;
        arr.add(hm.getOrDefault(o,0));
        
    }
    return arr;
}
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in array :");
        int n=scan.nextInt();
        int [] a=new int[n];
        System.out.println("enter the elements in array :");
        for(int i=0;i<n;i++)
        {
           a[i]=scan.nextInt();
        }
        System.out.println("enter x value :");
        int x=scan.nextInt();
        ArrayList<Integer> ar=AverageRepetative.repetative(a,x);
        System.out.println(ar);
     
    }
    

    
}
