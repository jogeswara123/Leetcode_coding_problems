class Solution {
    public int maxValidPairSum(int[] nums, int k) {
          int m=0,sum=0;
          for(int i=k;i<nums.length;i++){
            m=Math.max(m,nums[i-k]);
            sum=Math.max(sum,m+nums[i]);
          }
          return sum;

    }
}