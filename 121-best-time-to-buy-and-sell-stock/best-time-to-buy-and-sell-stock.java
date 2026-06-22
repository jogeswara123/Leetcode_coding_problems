class Solution {
    public int maxProfit(int[] prices) {
        int a=Integer.MAX_VALUE;
        int b=0;
        for(int i:prices){
            if(i<a){
                a=i;
            }
            else{
                b=Math.max(b,i-a);
            }
        }
        return b;
    }
}