class Solution {
    public boolean judgeSquareSum(int c) {
        int a=(int)Math.sqrt(c);
        int i=0,j=a;
        while(i<=j){
            long d=(1L*i*i)+(1L*j*j);
            if(c==d){
                return true;
            }
            if(c<d){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}