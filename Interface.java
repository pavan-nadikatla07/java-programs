interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
}
class Square implements Shape
{
	public void draw()
	{
		System.out.println("Drawing a Square");
	}
}

class Interface
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		c.draw();
		r.draw();
		s.draw();
	}
}