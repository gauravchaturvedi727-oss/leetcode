class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            result[i] = -1;

            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    for(int k = j + 1; k < nums2.length; k++) {
                        if(nums2[k] > nums2[j]) {
                            result[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return result;
    }
}