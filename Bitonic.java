import java.util.*;

public class Bitonic {
    static boolean bitonic(int a[])
    {
        ArrayList<Integer> increase=new ArrayList<>();
         ArrayList<Integer> same=new ArrayList<>();
          ArrayList<Integer> decrease=new ArrayList<>();
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
                increase.add(i);
            if(a[i]==a[i+1])
                same.add(i);
            if(a[i]>a[i+1])
                decrease.add(i);
        }
        boolean ret=false;
        if(increase.contains(0))
             if(Collections.max(increase)<Collections.min(decrease)&&((Collections.max(increase)<Collections.min(same))||same.isEmpty())&&((Collections.min(decrease)>Collections.max(same))||same.isEmpty()))
                 ret=true;
        if(decrease.contains(0))
            if(Collections.max(decrease)<Collections.min(increase)&&((Collections.max(decrease)<Collections.min(same))||same.isEmpty())&&((Collections.min(increase)>Collections.max(same))||same.isEmpty()))
                 ret=true;
        else{ ret=false;}
        return ret;

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
          System.out.print(Bitonic.bitonic(a));
        
    }
    
}
