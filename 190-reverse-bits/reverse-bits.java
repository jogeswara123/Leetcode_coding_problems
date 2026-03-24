class Solution {
    public int reverseBits(int n) {
        String r="";
        while(n!=0){
            r+=Integer.toString(n%2);
            n/=2;
        }
        String rev="";
        for(int i=r.length()-1;i>=0;i--){
            rev+=r.charAt(i);
        }
        int len=rev.length();
        int c=32-len;
        String res1="";
        for(int i=0;i<c;i++){
            res1+='0';
        }
        String res=res1+rev;
        int k=0;
        int sum=0;
        for(int i=0;i<res.length()-1;i++){
            sum+=(res.charAt(i)-'0')*Math.pow(2,k);
            k++;
        }

        return sum;
    }
}