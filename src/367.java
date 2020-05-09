class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2;
        long right = num / 2;

        while (left <= right) {
            long guess = left + (right - left) / 2;
            long squared = guess * guess;

            if (squared == num) return true;
            else if (squared > num) right = guess - 1;
            else left = guess + 1;
        }

        return false;
    }
}
