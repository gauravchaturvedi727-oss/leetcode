class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int maxRadius = 0;

        for(int i = 0; i < houses.length; i++){
            int mindistance = Integer.MAX_VALUE;

            for(int j = 0; j < heaters.length; j++){
                int distance = Math.abs(houses[i] - heaters[j]);

                mindistance = Math.min(mindistance, distance);
            }
            maxRadius = Math.max(maxRadius, mindistance);
        }
        return maxRadius;
    }
}