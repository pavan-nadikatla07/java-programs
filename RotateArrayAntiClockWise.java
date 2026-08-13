import java.util.Scanner;

class RotateArrayAntiClockWise {
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in array :");
        int n=scan.nextInt();
        int[] a=new int[n];
         System.out.println("enter elements :");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int temp=a[0];
        for(int i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=temp;
         System.out.println("after rotation");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    
}
