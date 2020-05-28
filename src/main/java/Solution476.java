public class Solution476 {
    public int findComplement(int num) {
        int highest = (int) (Math.log(Integer.highestOneBit(num)) / Math.log(2));
        int ans = 0;

        for (int i = 0; i < highest; i++) {
            if ((num & 1) == 0) ans |= (int) Math.pow(2, i);
            num >>= 1;
        }

        return ans;
    }
}
