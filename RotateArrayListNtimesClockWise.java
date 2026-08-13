import java.util.ArrayList;
import java.util.Scanner;

class RotateArrayListNtimesClockWise {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in array :");
        int n=scan.nextInt();
        System.out.println("enter no of rotations :");
        int r=scan.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
         System.out.println("enter elements :");
        for(int i=0;i<n;i++)
        {
            a.add(scan.nextInt());
        }
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=n-r;i<n;i++)
        {
            b.add(a.get(i));

        }
        for(int i=0;i<n-r;i++)
        {
            b.add(a.get(i));
        }
         System.out.println("after rotation");
        
            System.out.print(b);
    
    }
    
}
