class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0,i=0,a=0,b=0,c=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='a'){
                a++;
            }
            else if(s.charAt(j)=='b'){
                b++;
            }
            else{
                c++;
            }
            while(a>0&&b>0&&c>0){
                ans+=(s.length()-j);
                if(s.charAt(i)=='a'){
                    a--;
                }
                else if(s.charAt(i)=='b'){
                    b--;
                }
                else{
                    c--;
                }
                i++;
            }
        }
        return ans;
    }
}