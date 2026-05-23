class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c=i+1;
                break;
            }
        }
        int b[]=new int[nums.length];
        int j=0;
        for(int i=c;i<nums.length;i++){
            b[j]=nums[i];
            j++;
        }
        for(int i=0;i<c;i++){
            b[j]=nums[i];
            j++;
        }
        for(int i=0;i<j-1;i++){
            if(b[i]>b[i+1]){
                return false;
            }
        }
        return true;
    }
}