class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder s1 = new StringBuilder();
        int op=0,cl=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                op++;
            }
            else{
                cl++;
            }
            if(op==cl){
                op=0;
                cl=0;
            }
            if(op>1){
                s1.append(i);
            }
        }
       return s1.toString();
    }
}