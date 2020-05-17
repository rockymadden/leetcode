class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] set = new int[nums.length + 1];

        for (int num : nums) {
            if (set[num] != 0) list.add(num);
            else set[num]++;
        }

        return list;
    }
}
