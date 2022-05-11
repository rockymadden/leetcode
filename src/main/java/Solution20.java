import java.util.*;

public class Solution20 {
    public static final Map<Character, Character> BRACKETS = Map.of(
        ')', '(',
        '}', '{',
        ']', '['
    );

    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (BRACKETS.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != BRACKETS.get(c)) return false;
                else stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
