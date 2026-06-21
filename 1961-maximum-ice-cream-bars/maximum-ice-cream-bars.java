class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i: costs){
            coins-=i;
            if(coins<0){
                break;
            }
            c++;
        }
        return c;
    }
}