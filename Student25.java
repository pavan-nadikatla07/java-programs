import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate grade
    String getGrade() {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    int getId() {
        return id;
    }

    void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Marks: " + marks +
            ", Grade: " + getGrade()
        );
    }
}

public class Students25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student(101, "Pavan", 92));
        students.add(new Student(102, "Rahul", 78));
        students.add(new Student(103, "Kiran", 65));
        students.add(new Student(104, "Arjun", 45));

        System.out.println("----- All Students -----");

        for (Student s : students) {
            s.display();
        }

        // Searching student
        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Student s : students) {

            if (s.getId() == searchId) {
                System.out.println("\nStudent Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}