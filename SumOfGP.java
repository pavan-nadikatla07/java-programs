
import java.math.*;

class SumOfGP {
    public int sumOfGP(int n, int a, int r) {
        if (r == 1) {
            return a * n;
        }

        long x = (long) Math.pow(r, n);
        return (int) ((a * (x - 1)) / (r - 1));
    }
}
