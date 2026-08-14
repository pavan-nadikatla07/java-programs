class Student 
{
    String name;
    int age;
    Student(String n, int a) 
    {
        name = n;
        age = a;
    }
    Student() 
    {
        name = "no name entered";
        age = 0;
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ConstructorDemo 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Pavan", 18);
        Student s2 = new Student();
        s1.display();
        s2.display();

    }
}