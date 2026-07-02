class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long a=0;
        long m=mul;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=nums.length-k;i--){
            if(m>0){
                a+=(nums[i]*m);
                m--;
            }
            else{
                a+=nums[i];
            }
        }
        return a;
    }
}