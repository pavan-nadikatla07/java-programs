import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

class FrequencyKAscending {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter no of elements in array: ");
      int n=scan.nextInt();
      System.out.println("enter k value ");
      int k=scan.nextInt();
      int[] arr=new int[n];
      int x=0;
      TreeMap<Integer,Integer> hm=new  TreeMap<>();
      System.out.println("enter elements : ");
      for(int i=0;i<n;i++)
      {
         arr[i]=scan.nextInt();
         hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
         
      }
      Set<Integer> se=hm.keySet();
      for(int y:se)
        if(hm.get(y)==k){
             System.out.print(y+" ");
             
        }
      
        

    }
    
}
