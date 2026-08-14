import java.util.*;

class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++)
             arr[i] = sc.nextInt();
        for (int i=0;i<n-1;i++)
            for (int j=0;j<n-i-1;j++)
                if (arr[j] > arr[j+1]) 
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                }
        System.out.println("after sorting");
        for (int o=0;o<n;o++) 
             System.out.print(arr[o] + " ");
    }
}