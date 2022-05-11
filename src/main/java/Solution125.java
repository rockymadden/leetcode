public class Solution125 {
    public boolean isPalindrome(String s) {
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);

            if (c >= '0' && c <= '9') sb.append(c);
            else if (c >= 'a' && c <= 'z') sb.append(c);
            else if (c >= 'A' && c <= 'Z') sb.append((char)(c + ('a' - 'A')));
        }

        for (int i = 0, j = sb.length() - 1; i < j; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) return false;
        }

        return true;
    }
}
