class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int leftSum = 0;
        for(int j = 0; j < nums.length; j++){
            int rightSum = sum - leftSum - nums[j];
            if(leftSum == rightSum){
                return j;
            }
            leftSum = leftSum + nums[j];
        }
        return -1;
    }
}