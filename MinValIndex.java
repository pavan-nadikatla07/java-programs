import java.util.*;
import java.lang.*;
import java.io.*;

class MinValIndex
{

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    for(int o=0;o<t;o++)
	    {
	        int n=scan.nextInt();
		    int[] b=new int[n];
		    int min=Integer.MAX_VALUE;
		    int index=-1;
		    for(int i=0;i<n;i++)
		    {
		        b[i]=scan.nextInt();
		        if(b[i]<min)
		           {
		               min=b[i];
		               index=i;-
		           }
		    }
		    
		    System.out.println(index+1);
	    }

	}
	
}
