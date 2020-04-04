class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] across = new int[grid.length];
        int[] down = new int[grid[0].length];
        int ans = 0;
                
        for (int i = 0; i < across.length; i++) {
            for (int j = 0; j < down.length; j++) {
                across[i] = Math.max(across[i], grid[i][j]);
            }
        }
        
        for (int i = 0; i < down.length; i++) {
            for (int j = 0; j < across.length; j++) {
                down[i] = Math.max(down[i], grid[j][i]);
            }
        }
        
        for (int i = 0; i < across.length; i++) {
            for (int j = 0; j < down.length; j++) {
                ans += Math.min(across[i], down[j]) - grid[i][j];
            }
        }
        
        return ans;
    }
}