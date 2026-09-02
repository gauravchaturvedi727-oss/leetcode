class Solution {
    public int findClosestNumber(int[] nums) {

        int minDistance = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            int distance = Math.abs(nums[i]);

            if (distance < minDistance ||
                (distance == minDistance && nums[i] > answer)) {

                minDistance = distance;
                answer = nums[i];
            }
        }

        return answer;
    }
}