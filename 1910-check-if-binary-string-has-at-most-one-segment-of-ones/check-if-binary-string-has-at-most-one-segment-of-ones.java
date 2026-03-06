class Solution {
    public boolean checkOnesSegment(String s) {
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
            else{
                c=0;
            }
            if(c==1){
                return false;
            }
        }
        return true;
    }
}