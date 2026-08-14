package csea;
public class A
{
 	private int a=10;
 	int b=20;
	protected int c=30;
	public int d=40;
	public void dispA()
	{
 		System.out.println("private variable: "+a);
		System.out.println("Default variable: "+b);
		System.out.println("protected variable: "+c);
		System.out.println("public variable: "+d);
	}
}