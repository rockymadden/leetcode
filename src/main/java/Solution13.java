import java.util.*;

public class Solution13 {
    public static Map<Character, Integer> MAP = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );

    public int romanToInt(String s) {
        char last = '\u0000';
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            final char numeral = s.charAt(i);

            if (numeral == 'I' && (last == 'V' || last == 'X')) sum -= 1;
            else if (numeral == 'X' && (last == 'L' || last == 'C')) sum -= 10;
            else if (numeral == 'C' && (last == 'D' || last == 'M')) sum -= 100;
            else sum += MAP.get(numeral);

            last = numeral;
        }

        return sum;
    }
}
