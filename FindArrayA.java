import java.util.*;
import java.lang.*;
import java.io.*;

class FindArrayA
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    for(int o=0;o<t;o++)
	    {
	        int n=scan.nextInt();
		Long[] b=new Long[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
		    b[i]=scan.nextLong();
		    sum+=b[i];
		}
		sum=sum/(n+1);
		for(int i=0;i<n;i++)
		{
		    System.out.print((b[i]-sum)+" ");
		}
		 System.out.println();
	    }
		

	}
}
