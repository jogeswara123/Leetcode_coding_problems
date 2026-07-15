class Solution {
    public int countDigits(int num) {
        if(num<10){
            return 1;
        }
        int temp=num;
        int c=0;
        while(temp>0){
            int b=temp%10;
            if(num%b==0){
               c++;
            }
            temp/=10;
        }
        return c;
    }
}