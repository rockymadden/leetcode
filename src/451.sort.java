class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) return "";

        char[] chs = s.toCharArray();
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        Arrays.sort(chs);
        sb.append(chs[0]);

        for (int i = 1; i < chs.length; i++) {
            if (chs[i] != chs[i - 1]) {
                ans.add(sb.toString());
                sb.setLength(0);
            }

            sb.append(chs[i]);
        }

        ans.add(sb.toString());
        ans.sort((String s1, String s2) -> s2.length() - s1.length());
        sb.setLength(0);

        for (String str : ans) sb.append(str);

        return sb.toString();
    }
}
