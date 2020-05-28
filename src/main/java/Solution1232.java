public class Solution1232 {
    private double atan(int[] a, int[] b) {
        int x = b[0] - a[0];
        int y = b[1] - a[1];
        double r = Math.atan2(y, x);

        return Math.abs(r);
    }

    public boolean checkStraightLine(int[][] coordinates) {
        double a = atan(coordinates[0], coordinates[1]);

        for (int i = 1; i < coordinates.length; i++) {
            if (atan(coordinates[0], coordinates[i]) != a && atan(coordinates[i], coordinates[0]) != a)
                return false;
        }

        return true;
    }
}
