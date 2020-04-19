class Solution {
    public int subtractProductAndSum(int n) {
        int remainder, sum = 0;
        int product = 1;

        while (n > 0) {
            remainder = n % 10;
            n = n / 10;
            product *= remainder;
            sum += remainder;
        }
        
        return product - sum;
    }
}