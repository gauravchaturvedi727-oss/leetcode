class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int lsum = 0;
        for(int j = 0; j < nums.length; j++){
            int rsum = sum - lsum - nums[j];
            if(lsum == rsum){
                return j;
            }
            lsum = lsum + nums[j];
        }
        return -1;
    }
}