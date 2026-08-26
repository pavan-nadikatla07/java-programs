import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        int[] numbers = {542, 504, 552};

        Random random = new Random();

        int index = random.nextInt(numbers.length);

        System.out.println("Random number: " + numbers[index]);
    }
}