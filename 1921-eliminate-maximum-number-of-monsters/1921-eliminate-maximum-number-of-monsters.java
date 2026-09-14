import java.util.*;

class Solution {

    public int eliminateMaximum(int[] dist, int[] speed) {

        int time = 0;
        int kill = 0;
        float[] areaTime = new float[dist.length];
        for(int i = 0; i < dist.length; i++){
            areaTime[i] = (float) dist[i] / speed[i];
        }
        Arrays.sort(areaTime);
        for(int i = 0; i < dist.length; i++){
            if(areaTime[i] > time){
                time++;
                kill++;
            }
            else{
                return kill;
            }
        }
        return kill;
    }
}