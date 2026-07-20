class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        for(int i=0;i<n;i++){
            int b=start+2*i;
            sum^=b;
        }
        return sum;
    }
}