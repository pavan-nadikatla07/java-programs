import java.util.*;

public class BinaryD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int zeros = 0;
        int ones = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')
                zeros++;
            else if(s.charAt(i) == '1')
                ones++;
        }

        System.out.println("Zeros: " + zeros);
        System.out.println("Ones: " + ones);
    }
}