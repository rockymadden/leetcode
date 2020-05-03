class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        int[] mag = new int[26];

        for (int i = 0; i < n; i++) {
            mag[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < m; i++) {
            mag[ransomNote.charAt(i) - 'a']--;
            if (mag[ransomNote.charAt(i) - 'a'] < 0) return false;
        }

        return true;
    }
}
