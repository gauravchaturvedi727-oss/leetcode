class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();

        int n = s.length();
        int start = 0;

        while(start < n){
            int end = start;

            for(int i = start; i <= end; i++){
                char recent_element = s.charAt(i);

                for(int j = i + 1; j < n; j++){

                    if(recent_element == s.charAt(j)){
                        end = Math.max(end, j);
                    }
                }
            }
            list.add(end - start + 1);

            start = end + 1;
        }
        return list;
    }
}