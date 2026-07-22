class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int s=0;
        while(num>0){
            int b=num%10;
            s+=b;
            num=num/10;
        }
        if(s>=10){
           return  addDigits(s);
        }
        return s;
    }
}