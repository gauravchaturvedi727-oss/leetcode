class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        int maxSum = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        double average = (double)maxSum / k ;
        return average;
    }
}