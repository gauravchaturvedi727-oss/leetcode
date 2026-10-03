class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, new ArrayList<>(), result);
        return result;
    }
    public void generate(int[] nums, List<Integer> current, List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int num : nums){
            if(current.contains(num)){
                continue;
            }
            current.add(num);
            generate(nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}