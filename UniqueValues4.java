import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class UniqueValues4 {
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
         hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
         
      }
      Set<Integer> se=hm.keySet();
      int c=0;
      for(int y:se)
        if(hm.get(y)>1){
             System.out.println("array contains some duplicate values ");
             c++;
        }
      if(c==0)
         System.out.println("the array contains all unique values");
        

    }
    
    
}
