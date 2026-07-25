class Solution {
    public int maxProduct(int n) {
     int max=0,max2=0;
     while(n>0){
        int r=n%10;
        if(r>max){
            max2=max;
            max=r;
        }
        else if(r>=max2){
            max2=r;
        }
        n/=10;
     }
     return max*max2;
    }
}