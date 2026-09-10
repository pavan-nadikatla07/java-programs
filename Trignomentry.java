import java.util.*;

public class Trignomentry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double radian = Math.toRadians(angle);

        System.out.println("Sin: " + Math.sin(radian));
        System.out.println("Cos: " + Math.cos(radian));
        System.out.println("Tan: " + Math.tan(radian));
    }
}