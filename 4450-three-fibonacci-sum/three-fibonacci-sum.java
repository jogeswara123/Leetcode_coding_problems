class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0,b=1;
        int sum=a+b;
        while(true){
            int c=a+b;
            sum+=c;
            if(sum==n){
                return true;
            }
            else if(sum>n){
                return false;
            }
            sum-=a;
            a=b;
            b=c;
        }
    }
}