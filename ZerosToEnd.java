import java.util.*;
class ZerosToEnd {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("enter the numbersn :");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr0=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
                arr0.add(a[i]);
            else
                arr.add(a[i]);
        }
        for(int i=0;i<arr0.size();i++)
        {
            arr.add(0);
        }
        System.out.println("after moving all the zeros to the end ");
        for(int i=0;i<arr.size();i++)
        {
             System.out.print(" "+arr.get(i));
        }

    }
    
}
