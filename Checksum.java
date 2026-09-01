import java.util.*;

class Checksum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of data words: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter the data words (0-255):");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            sum = sum + data;

            if (sum > 255) {
                sum = (sum & 255) + 1;
            }
        }

        int checksum = (~sum) & 255;

        System.out.println("Sum = " + sum);
        System.out.println("Checksum = " + checksum);
    }
}
