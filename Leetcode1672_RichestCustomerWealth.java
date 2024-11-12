class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1;
        for (int[] n : accounts) {
            int sum = 0;
            for (int m : n) {
                sum = sum + m;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}