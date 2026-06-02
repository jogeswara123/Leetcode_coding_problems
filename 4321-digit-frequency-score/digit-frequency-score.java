class Solution {
    public int digitFrequencyScore(int n) {
        int m=0;
        while(n!=0){
            m+=n%10;
            n/=10;
        }
        return m;
    }
}