class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                stack.push(i);
            }
            else if(i==')'){
                stack.pop();
            }
            max=Math.max(max,stack.size());
        }
        return max;
    }
}