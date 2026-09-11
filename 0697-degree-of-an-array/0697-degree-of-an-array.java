class Solution {
    public int findShortestSubArray(int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int degree = 0;
        for(int i = 0; i < nums.length; i++){
            int frequency = 0;
            int firstIndex = i;
            int lastIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    frequency++;
                    lastIndex = j;
                }
            }
            int currentMax = lastIndex - firstIndex + 1;
            if(frequency > degree){
                degree = frequency;
                minLength = currentMax;
            }
            else if(frequency == degree){
                minLength = Math.min(minLength, currentMax);
            }
        }
        return minLength;
    }
}