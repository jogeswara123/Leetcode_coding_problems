class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
       int a=9,b=10,c=9;
       for(int i=2;i<=n;i++){
        a=a*c;
        b+=a;
        c--;
       }
       return b;
    }
}