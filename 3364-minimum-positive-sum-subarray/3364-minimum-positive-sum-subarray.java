class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min = Integer.MAX_VALUE;
        int n = nums.size();

        for (int len = l; len <= r; len++) {

            for (int i = 0; i + len <= n; i++) {

                int sum = 0;

                for (int j = i; j < i + len; j++) {
                    sum += nums.get(j);
                }

                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}