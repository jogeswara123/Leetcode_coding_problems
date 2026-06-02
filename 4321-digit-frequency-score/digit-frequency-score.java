class Solution {
    public int digitFrequencyScore(int n) {
        int m[]=new int[10];
        while(n!=0){
            int b=n%10;
            m[b]++;
            n/=10;
        }
        int l=0;
        for(int i=0;i<10;i++){
            l+=(i*m[i]);
        }
        return l;
    }
}