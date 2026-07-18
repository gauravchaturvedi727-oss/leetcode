class Solution {
    public int maxEvents(int[][] events) {

        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int day = 0;
        int count = 0;
        int i = 0;
        int n = events.length;
        while(i < n || !queue.isEmpty()){
            if(queue.isEmpty()){
                day = events[i][0];
            }

            while(i < n && events[i][0] == day){
                queue.offer(events[i][1]);
                i++;
            }
            while(!queue.isEmpty() && queue.peek() < day){
                queue.poll();
            }
            if(!queue.isEmpty()){
                queue.poll();
                count++;
            }
            day++;
        }
        return count;
    }
}