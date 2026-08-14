import java.util.*;
class Claculate
{
  void calc(int a,int b,int c,double d)
  {
   double r1,r2;
   if(d==0)
   {
    r1=-b/(2*a);
    System.out.println("Roots are real and equal");
    System.out.println("Root 1= " +r1+" Root2= " +r1);
   } 
   if(d>0)
   {
    r1=(-b-Math.sqrt(d))/(2*a);
    r2=(-b+Math.sqrt(d))/(2*a);
    System.out.println("Root 1= " +r1+" Root2= " +r2);
   }
   if(d<0)
   {
    r1=b/(2*a);
    r2=(Math.sqrt(-d)/(2*a));
    System.out.println(r1 +"i "+ r2);
    System.out.println("Roots are real and imaginary");
    }
                
  }
}
class QuadraticRoots
{
	 public static void main(String args[])
	 {
	 	int a,b,c;
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter a value:");
	 	a=sc.nextInt();
	 	System.out.println("Enter b value:");
	 	b=sc.nextInt();
	 	System.out.println("Enter c value:");
	 	c=sc.nextInt();
	 	double d=(b*b)-(4*a*c);
                Claculate cl=new Claculate();
                cl.calc(a,b,c,d);              
	 	
	 }
}
