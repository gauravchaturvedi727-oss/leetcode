class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        if (n == 1) return 1;

        int max = 1;

        for (int i = 0; i < n; i++) {

            int len = 1;
            int prev = 0;

            for (int j = i + 1; j < n; j++) {

                int curr;

                if (arr[j - 1] > arr[j]) {
                    curr = 1;
                } else if (arr[j - 1] < arr[j]) {
                    curr = -1;
                } else {
                    break;
                }

                if (prev == 0 || curr != prev) {
                    len++;
                    prev = curr;
                    max = Math.max(max, len);
                } else {
                    break;
                }
            }
        }

        return max;
    }
}