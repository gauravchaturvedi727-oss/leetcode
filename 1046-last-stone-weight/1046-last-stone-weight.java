class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            maxHeap.offer(num);
        }

        while(maxHeap.size() > 1){
            int first = maxHeap.poll();

            int second = maxHeap.poll();

            if(first != second){
                maxHeap.offer(first - second);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }
        else{
            return maxHeap.peek();
        }
    }
}