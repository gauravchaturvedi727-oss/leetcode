class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        double average = 0;
        for(int i = 0; i <= nums.length - k; i++){
            int currentMax = 0;
            for(int j = i; j < k + i; j++){
                currentMax += nums[j];
            }
            max = Math.max(max, currentMax);
            average = (double)max / k;
        }
        return average;
    }
}