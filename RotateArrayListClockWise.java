import java.util.*;
class RotateArrayListClockWise {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of elements in array :");
        int n=scan.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
         System.out.println("enter elements :");
        for(int i=0;i<n;i++)
        {
            a.add(scan.nextInt());
        }
        ArrayList<Integer> b=new ArrayList<>();
        b.add(a.get(a.size()-1));
        a.remove(a.size()-1);
        for(int i=0;i<a.size();i++)
        {
            b.add(a.get(i));
        }
         System.out.println("after rotation");
        
            System.out.print(b);
    
    }
    
}
