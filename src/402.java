class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && stack.size() > 0 && stack.peekLast() > digit) {
                stack.removeLast();
                k--;
            }

            stack.addLast(digit);
        }

        for (int i = 0; i < k; i++) stack.removeLast();

        StringBuilder sb = new StringBuilder();
        boolean seekZero = true;

        for (char digit : stack) {
            if (seekZero && digit == '0') continue;
            seekZero = false;
            sb.append(digit);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
