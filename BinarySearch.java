import java.util.*;
class BinarySearch
{
 int bSearch(int a[],int key,int low,int high)
 {
  int m;
  m=(low+high)/2;
  if(low>high)
     return -1;
  if(a[m]==key)
     return m;
  else if(a[m]>key)
     return bSearch(a,key,low,m-1);
  else
     return bSearch(a,key,m+1,high);
  }
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("enter no of elements:");
  int n=scan.nextInt();
  int[] arr=new int[n];
  System.out.println("enter elements:");
  int i;
  for(i=0;i<n;i++)
      arr[i]=scan.nextInt();
  Arrays.sort(arr);
  int result,r;
  System.out.println("enter search element:");
  r=scan.nextInt();
  BinarySearch bs=new BinarySearch();
  result=bs.bSearch(arr,r,0,n-1);
  if(result==-1)
      System.out.println("the is not available in the entered elements");
  else
      System.out.println("the element"+r+" is at position:"+(result+1)+" in acending order");
 }
}




   
   
  
 