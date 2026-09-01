import java.util.*;

class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();

        System.out.print("Enter window size: ");
        int window = sc.nextInt();

        for (int i = 1; i <= n; i += window) {
            System.out.println("Sending frames:");

            for (int j = i; j < i + window && j <= n; j++) {
                System.out.println("Frame " + j + " sent");
            }

            System.out.println("Acknowledgment received");
        }
    }
}