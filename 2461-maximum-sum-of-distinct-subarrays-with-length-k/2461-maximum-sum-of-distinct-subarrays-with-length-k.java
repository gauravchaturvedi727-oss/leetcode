class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long windowSum = 0;
        long max = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (map.size() == k) {
            max = windowSum;
        }
        for (int i = k; i < nums.length; i++) {

            int left = nums[i - k];
            windowSum -= left;
            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0) {
                map.remove(left);
            }
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.size() == k) {
                max = Math.max(max, windowSum);
            }
        }

        return max;
    }
}