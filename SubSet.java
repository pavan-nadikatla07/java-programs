import java.util.*;
import java.lang.*;
import java.io.*;

class SubSet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int o=0;o<T;o++)
		{
			int n=scan.nextInt();
			int[] count=new int[31];
			for(int i=0;i<n;i++)
			{
				int x=scan.nextInt();
				int bit=0;
				while(x>1)
				{
					x=x/2;
					bit++;
				}
				count[bit]++;
			}
			int ans=0;
			for(int i=0;i<31;i++)
			{
				if(count[i]>ans)
					ans=count[i];
			}
			System.out.println(ans);
		}
	}
}