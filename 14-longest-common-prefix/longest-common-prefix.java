class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        if(strs.length==1){
            return strs[0];
        }
        else{
              int c=strs[0].length();
              for(int i=1;i<strs.length;i++){
                if(c>strs[i].length()){
                    c=strs[i].length();
                }
              }
              for(int i=0;i<c;i++){
                int d=0;
                for(int j=0;j<strs.length-1;j++){
                         if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                            d=1;
                            break;
                         }
                }
                if(d==0)
                s+=strs[0].charAt(i);
                else
                return s;
              }
        }
        return s;
    }
}