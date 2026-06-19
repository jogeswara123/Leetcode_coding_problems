class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,s=0;
        for(int i:gain){
             s+=i;
             if(s>max){
                max=s;
             }
        }
        return max;
    }
}