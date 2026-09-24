class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int newIndex = (i + k) % n;
            result[newIndex] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = result[i];
        }
    }
}