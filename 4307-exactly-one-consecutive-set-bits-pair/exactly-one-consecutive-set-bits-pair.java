class Solution {
    public boolean consecutiveSetBits(int n) {
        char a[]=Integer.toBinaryString(n).toCharArray();
       int i=0,j=1,c=0;
       while(j<a.length){
        if(a[i]=='1'&&a[j]=='1'){
            c++;
        }
        i++;
        j++;
       }
       if(c==1){
        return true;
       }
       return false;
    }
}