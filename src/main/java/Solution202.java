public class Solution202 {
    private int next(int n) {
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int tortise = next(n);
        int hare = next(next(n));

        while ((tortise != 1 || hare != 1) && tortise != hare) {
            tortise = next(tortise);
            hare = next(next(hare));
        }

        return tortise == 1 || hare == 1;
    }
}
