import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GreaterThanLeftArray {
    static ArrayList<Integer> greater(int a[],int n)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
         int count=0,max=-1;
        for(int i=0;i<n;i++)
        {
           if(a[i]>max)
           {
            arr.add(a[i]);
            max=a[i];
           }
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
       
       System.out.print(GreaterThanLeftArray.greater(a,n));

          
        
    }
    

    

    
}
