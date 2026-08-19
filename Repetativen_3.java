import java.util.*;

public class Repetativen_3 {
    static ArrayList<Integer> repeate(int a[],int n)
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
            if(hm.getOrDefault(i, 0)>(n/3))
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
       
       System.out.print(Repetativen_3.repeate(a,n));

          
        
    }
    

    
}
