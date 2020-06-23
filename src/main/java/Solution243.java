public class Solution243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE, w1 = -1, w2 = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1))
                w1 = i;
            else if (words[i].equals(word2))
                w2 = i;

            if (w1 >= 0 && w2 >= 0)
                min = Math.min(min, Math.abs(w1 - w2));
        }

        return min;
    }
}
