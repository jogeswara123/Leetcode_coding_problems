class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int i=0;
        if(n-k<=0){
            i=1;
        }
        else{
            i=n-k;
        }
        int j=n+k;
        int sum=0;
        while(i<=j){
            if(Math.abs(n-i)<=k&&(n&i)==0){
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}