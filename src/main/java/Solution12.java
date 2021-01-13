public class Solution12 {
    private final static String[] SYMBOLS = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final static int[] VALUES = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {
        if (num < 1 || num > 3999) return "";

        final StringBuilder sb = new StringBuilder();
        int i = 0;

        while (num > 0 && i < SYMBOLS.length) {
            final int times = num / VALUES[i];
            num %= VALUES[i];

            for (int j = 0; j < times; j++) sb.append(SYMBOLS[i]);
            i++;
        }

        return sb.toString();
    }
}
