import java.util.*;
import java.lang.*;
import java.io.*;

class 3rdLargest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int first=-1,second=-1,third=-1;

		while(n>0)
		{
			int d=n%10;
			if(d>first)
			{
				third=second;
				second=first;
				first=d;
			}
			else if(d>second&&d<first)
			{
				third=second;
				second=d;
			}
			else if(d>third&&d<second)
			{
				third=d;
			}
			n=n/10;
		}

		System.out.println(third);
	}
}