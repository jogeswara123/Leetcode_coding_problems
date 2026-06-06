class Solution {
    public int[] leftRightDifference(int[] nums) {
        int m[]=new int[nums.length+1];
        int n[]=new int[nums.length+1];
        int c=0;
        m[0]=0;
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
            m[i+1]=c;
        }
        c=0;
        n[nums.length]=0;
        for(int i=nums.length-1;i>=0;i--){
            c+=nums[i];
            n[i]=c;
        }
        int re[]=new int[nums.length];
        int i=0,j=1;
        while(i<nums.length&&j<n.length){
            re[i]=Math.abs(m[i]-n[j]);
            i++;
            j++;
        }
        return re;
    }
}