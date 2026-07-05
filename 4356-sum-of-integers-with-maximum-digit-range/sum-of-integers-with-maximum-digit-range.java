class Solution {
    public int maxDigitRange(int[] nums) {
        int a[]=new int[nums.length];
        int m=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int temp=nums[i];
            while(temp>0){
                min=Math.min(min,temp%10);
                max=Math.max(max,temp%10);
                temp/=10;
            }
            a[i]=max-min;
           m=Math.max(m,max-min);

        }
        for(int i=0;i<nums.length;i++){
            if(a[i]==m){
                sum+=nums[i];
            }
        }
        return sum;
    }
}