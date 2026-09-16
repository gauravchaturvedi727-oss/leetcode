class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int[] unique = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unique[index] = num;
            index++;
        }
        Arrays.sort(unique);
        int count = 1;
        int maxCount = 1;
        for(int i = 1; i < unique.length; i++){
            if(unique[i] == unique[i-1] + 1){
                count++;
            }
            else{
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}