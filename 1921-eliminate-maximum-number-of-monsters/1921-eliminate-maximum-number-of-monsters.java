import java.util.*;

class Solution {

    public int eliminateMaximum(int[] dist, int[] speed) {

        int time = 0;
        int kill = 0;
        float[] arrivalTime = new float[dist.length];

        for (int i = 0; i < dist.length; i++) {
            arrivalTime[i] = (float) dist[i] / speed[i];
        }
        Arrays.sort(arrivalTime);
        for (int i = 0; i < dist.length; i++) {

            if (arrivalTime[i] > time) {
                kill++;
                time++;
            }
            else {
                return kill;
            }
        }

        return kill;
    }
}