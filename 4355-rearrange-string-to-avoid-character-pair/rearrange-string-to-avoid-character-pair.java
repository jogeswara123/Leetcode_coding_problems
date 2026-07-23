class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        int c=0;
        if(s.contains(String.valueOf(y))){
        for(char i:s.toCharArray()){
            if(x==i){
               s2.append(x);
            }
            else if(i==y){
                 s3.append(y);
            }
            else{
               s1.append(i);
            }
        }
       return s3.toString()+s1.toString()+s2.toString();
        }
        return s;
    }
}