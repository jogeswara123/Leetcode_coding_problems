class Solution {
    public int digit(int n){
        int sum=0;
        while(n>0){
            int b=n%10;
            sum+=b;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int s=digit(nums[i]);
            if(i==s){
                min=Math.min(min,s);
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}