class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i)
                c++;
            }
            if(c==0)
            return i;
        }
        return 0;
        
    }
}