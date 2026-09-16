import java.util.Scanner;
public class SortedSquares {
    static int[] sortedSquares(int[] a, int n) 
    {
        int l=0,r=n-1,k=n-1;
        int[] b=new int[n];
        while(l<=r&&k>=0)
        {
            if(a[l]*a[l]<a[r]*a[r])
            {
                b[k]=a[r]*a[r];
                r--;k--;
            }
            else{
                b[k]=a[l]*a[l];
                l++;k--;
            }
        }
        return b;

    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("the sorted squares of the array is: ");
        arr=sortedSquares(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    

    
}
