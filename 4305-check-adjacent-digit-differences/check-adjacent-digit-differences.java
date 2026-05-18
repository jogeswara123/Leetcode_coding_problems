class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char a[]=s.toCharArray();
        for(int i=0;i<a.length-1;i++){
            int b=a[i]-'0';
            int c=a[i+1]-'0';
            if(Math.abs(b-c)>2){
                return false;
            }
        }
        return true;
    }
}