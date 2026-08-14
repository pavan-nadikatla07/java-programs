class Shape
{
        Shape(String c,String t,String r)
        {
         System.out.println("select a shape from "+c+" "+t+" "+r+" to draw");
        }
	String colour = "red";
	void print()
	{
		System.out.println("Drawing a shape");
	}
}
class Rectangle extends Shape
{
        Rectangle(String c,String t,String r)
        {
         super(c,t,r);
         System.out.println("selected shape as "+ c);
        }
	String colour = "blue";
	void print()
	{
                super.print();
		System.out.println("The colour inside is "+super.colour);
		System.out.println("The colour outside is "+colour);
	}
}
class SuperKeyword
{
	public static void main(String arg[])
	{
		Rectangle r = new Rectangle("circle","triangle","rectangle");
		r.print();
	}
}