class Solution {
    public int longestMonotonicSubarray(int[] nums) {
          int maxLength = 1;
        int increasingLength = 1;
        int decreasingLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increasingLength++;
                decreasingLength = 1; // Reset decreasingLength
            } else if (nums[i] < nums[i - 1]) {
                decreasingLength++;
                increasingLength = 1; // Reset increasingLength
            } else {
                increasingLength = 1;
                decreasingLength = 1;
            }

            maxLength = Math.max(maxLength, Math.max(increasingLength, decreasingLength));
        }

        return maxLength;
    }
}