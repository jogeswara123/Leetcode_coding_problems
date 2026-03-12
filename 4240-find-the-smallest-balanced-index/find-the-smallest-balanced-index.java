class Solution {
    public int smallestBalancedIndex(int[] nums) {

        int n = nums.length;

        long[] right = new long[n];
        right[n-1] = 1;

        for(int i=n-2;i>=0;i--){
            if(right[i+1] > Long.MAX_VALUE / nums[i+1]){
                right[i] = Long.MAX_VALUE;
            }else{
                right[i] = right[i+1] * nums[i+1];
            }
        }

        long leftSum = 0;

        for(int i=0;i<n;i++){
            if(leftSum == right[i]){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}