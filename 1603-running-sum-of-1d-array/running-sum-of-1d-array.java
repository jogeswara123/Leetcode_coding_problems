class Solution {
    public int[] runningSum(int[] nums) {
        int a[]=new int[nums.length];
       int i=0,sum=0;
       while(i<nums.length){
        sum+=nums[i];
        a[i]=sum;
        i++;
       }
       return a;
    }
}