class Solution {
    public int findGCD(int[] nums) {
       int min=Integer.MAX_VALUE;
       int max=0;
       for(int i:nums){
        min=Math.min(min,i);
        max=Math.max(max,i);
       }
       while(min!=0){
        int temp=max%min;
        max=min;
        min=temp;
       }
        
        return max;
    }
}