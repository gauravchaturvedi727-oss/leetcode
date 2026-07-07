import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                sum = sum - 1;
            } else {
                sum = sum + 1;
            }

            if (map.containsKey(sum)) {

                int previousIndex = map.get(sum);

                int length = i - previousIndex;

                maxLength = Math.max(maxLength, length);

            } else {

                map.put(sum, i);
            }
        }

        return maxLength;
    }
}