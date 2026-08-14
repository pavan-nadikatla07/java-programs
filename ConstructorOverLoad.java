class Student 
{
    String name;
    int year;
    String town;

    Student(String n) 
    {
        name = n;
    }

    Student(String n, int a) 
    {
        name = n;
        year = a;
    }

    Student(String n, int a, String c) 
    {
        name = n;
        year = a;
        town = c;
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("year: " + year);
        System.out.println("town: " + town);
        System.out.println();
    }
}

public class ConstructorOverLoad 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Pavan");
        Student s2 = new Student("anvesh", 2);
        Student s3 = new Student("sumanth", 1, "tenali");
        s1.display();
        s2.display();
        s3.display();
    }
}