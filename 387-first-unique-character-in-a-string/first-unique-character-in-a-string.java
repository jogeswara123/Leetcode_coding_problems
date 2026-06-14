class Solution {
    public int firstUniqChar(String s) {
        int a[]=new int[26];
        char b[]=s.toCharArray();
        for(char i:b){
            a[i-'a']++;
        }
        int m=s.length()+1;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                char d=(char)(97+i);
                if(s.indexOf(d)<m){
                    m=s.indexOf(d);
                }
            }
        }
       if(m!=s.length()+1){
        return m;
       }
       return -1;
    }
}