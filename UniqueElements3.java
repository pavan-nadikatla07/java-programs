import java.util.*;

class UniqueElements3 {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter no of elements in array: ");
      int n=scan.nextInt();
      int[] arr=new int[n];
      int x=0;
      HashMap<Integer,Integer> hm=new  HashMap<>();
      System.out.println("enter elements : ");
      for(int i=0;i<n;i++)
      {
         arr[i]=scan.nextInt();
         hm.put(arr[i],hm.getOrDefault(arr,0)+1);
         
      }
      Set<Integer> se=hm.keySet();
 
        if(arr.length==se.size())
             System.out.println("the array contains all unique values");
        else
            System.out.println("attay contains some duplicate values ");
            

    }
    
    
}
