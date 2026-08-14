abstract class Shape 
{
    abstract double area();
}

class Circle extends Shape 
{
    double radius;
    Circle(double r) 
    {
       radius = r;
    }
    double area() 
    {
        return (3.14* radius)*radius;
    }
}

class Rectangle extends Shape 
{
    double length, width;
    Rectangle(double l, double w) 
    {
        length = l;
        width = w;
    }
    double area() 
    {
        return length * width;
    }
}

class Triangle extends Shape 
{
    double base, height;
    Triangle(double b, double h) 
    {
        base = b;
        height = h;
    }
    double area() 
    {
        return (0.5 * base)*height;
    }
}

public class AbstractShape 
{
    public static void main(String[] args) 
    {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(3, 7);
        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Triangle area: " + t.area());
    }
}