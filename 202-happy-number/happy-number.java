class Solution {
    public boolean isHappy(int n) {
        while(Integer.toString(n).length()!=1){
            int m=0;
            while(n>0){
                int b=n%10;
                m+=(b*b);
                n/=10;
            }
            n=m;
        }
        if(n==1||n==7){
            return true;
        }
        return false;
    }
}