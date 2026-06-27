class Solution {
    public String removeTrailingZeros(String num) {
        int r=num.length()-1;
        while(r>=0){
            if(num.charAt(r)!='0'){
                break;
            }
            r--;
        }
        return num.substring(0,r+1);
    }
}