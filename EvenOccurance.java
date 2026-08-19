import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EvenOccurance {
     static ArrayList<Integer> evenOccurance(int a[],int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=a.length-1;i>=0;i--)
        {
           hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
        }
        Set<Integer> it=hm.keySet();
        for(int i:it)
        {
            if(hm.getOrDefault(i, 0)==2)
                arr.add(i);
        }
        return arr;

    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter no of elements :");
        int n=scan.nextInt();
        System.out.print("enter the elements :");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
       ArrayList<Integer> ar=EvenOccurance.evenOccurance(a,n);
       System.out.print(ar.size()>0?ar:-1);

          
        
    }
    

    
}
