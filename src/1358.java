class Solution {
    public int numberOfSubstrings(String s) {
        int[] set = new int[3];
        int n = s.length();
        int ans = 0;

        for (int end = 0, start = 0, size = 0; end < n; end++) {
            char endChar = s.charAt(end);
            if(set[endChar - 'a'] == 0) size++;
            set[endChar - 'a']++;

            while (size == 3) {
                ans += (n - end);
                char startChar = s.charAt(start++);
                set[startChar - 'a']--;
                if(set[startChar - 'a'] == 0) size--;
            }
        }

        return ans;
    }
}

