import java.util.*;
class Leaders {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        int max=a[n-1];
        arr.add(a[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>=max)
            {
                arr.add(a[i]);
                max=a[i];
            }
        }
        System.out.println("leaders are :");
        for(int i=0;i<arr.size();i++)
                 System.out.println(arr.get(i));
    }
    
}
