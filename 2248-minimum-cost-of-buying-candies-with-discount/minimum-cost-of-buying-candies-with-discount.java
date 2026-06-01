class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if(cost.length<=2){
            int m=0;
            for(int i:cost){
                m+=i;
            }
            return m;
        }
        int m=0;
        for(int i=cost.length-1;i>=0;i-=3){
            m+=cost[i];
            if (i - 1 >= 0)
            m+=cost[i-1];
        }
        return m;
    }
}