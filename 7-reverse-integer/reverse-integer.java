class Solution {
    public int reverse(int x) {
        int sum=0;
       int temp=x;
       x=Math.abs(x);
        while(x>0){
            int b=x%10;
            if (sum > Integer.MAX_VALUE / 10 ||
       (sum == Integer.MAX_VALUE / 10 && b > 7)) {
        return 0;
    }
            sum=(sum*10)+b;
            x=x/10;
        }
        return (temp>0)?sum:-sum;
    }
}