import java.util.*;
class Employee
{
 int id;
 String name;
 float salary;
 Scanner scan=new Scanner(System.in);
 void read()
 {
  System.out.println("enter id:");
  id=scan.nextInt();
  System.out.println("enter name:");
  name=scan.next();
  System.out.println("enter salary:");
  salary=scan.nextFloat();
 }
 void display()
 {
  System.out.println("id:"+id);
  System.out.println("name:"+name);
  System.out.println("enter salary:"+salary);
  }
}
class Programmer extends Employee
{
 float bonous=5000.0f;
 void print()
 {
  System.out.println("bonous:"+bonous);
 }
 
}
class SingleInheritance extends Programmer
{
 public static void main(String args[])
 {
  Employee e=new Employee();
  Programmer p=new Programmer();
  SingleInheritance s=new SingleInheritance();
  e.read();
  p.display();
  s.print();
 }
}