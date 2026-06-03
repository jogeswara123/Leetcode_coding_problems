class Solution {
    public int minimumSwaps(int[] nums) {
        int m=0;
        for(int i:nums){
            if(i==0){
                m++;
            }
        }
        int l=0;
        for(int i=nums.length-m;i<nums.length;i++){
            if(nums[i]==0){
                l++;
            }
        }
        return m-l;

    }
}