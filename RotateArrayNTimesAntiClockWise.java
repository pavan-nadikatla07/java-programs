 
    import java.util.Scanner;

class RotateArrayNTimesAntiClockWise {
     public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in array :");
        int n=scan.nextInt();
        System.out.println("enter no of rotations of array :");
        int r=scan.nextInt();
        int[] a=new int[n];
         System.out.println("enter elements :");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int[] temp=new int[r];
        for(int i=0;i<r;i++)
        {
            temp[i]=a[i];
        }
        int t=0;
        for(int i=r;i<n;i++,t++)
        {
            a[t]=a[i];
        } 
        t=0;
        for(int i=n-r;i<n;i++)
        {
            a[i]=temp[t];
            t++;
        }
         System.out.println("after rotation");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    
}

    

