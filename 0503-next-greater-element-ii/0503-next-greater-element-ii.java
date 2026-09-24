class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        for(int i = 0; i < n; i++){
            result[i] = -1;
            for(int j = 1; j < n; j++){
                int index = (i + j) % n;

                if(nums[i] < nums[index]){
                    result[i] = nums[index];
                    break;
                }
            }
        }
        return result;
    }
}
