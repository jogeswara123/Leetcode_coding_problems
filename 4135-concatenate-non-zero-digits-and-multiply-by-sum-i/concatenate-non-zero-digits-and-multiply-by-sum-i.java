class Solution {
    public long sumAndMultiply(int n) {
       StringBuilder a = new StringBuilder();
        int sum=0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int b=n%10;
            if(b!=0){
                sum+=b;
                a.append(b);
            }
            n/=10;
        }
        a.reverse();
        long c = Long.parseLong(a.toString())*sum;
        return c;
        
    }
}