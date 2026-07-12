class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int max = 0;
        int average = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        int count = 0;
        int windowSum = sum;
        if(windowSum/ k >= threshold){
            count = 1;
        }
        else{
            count = 0;
        }
        for(int j = k; j < arr.length; j++){
            windowSum = windowSum + arr[j] - arr[j-k];

            average = windowSum / k;
            if(average >= threshold){
                count++;
            }
        }
        return count;
    }
}