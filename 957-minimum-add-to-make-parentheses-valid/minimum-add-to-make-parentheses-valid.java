class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int c=0;
        for(char i:s.toCharArray()){
            if(i==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    c++;
                }
            }
            else{
                stack.push(i);
            }
        }
        c+=stack.size();
        return c;
    }
}