class Solution {
    public boolean isValid(String s) {
        Stack <Character> a = new Stack<>();
        for(char i: s.toCharArray()){
            if(i==')'){
                if(a.empty()){
                    return false;
                }
                else if(a.peek()=='('){
                    a.pop();
                }
                else{
                    return false;
                }
            }
            else if(i==']'){
                if(a.empty()){
                    return false;
                }
                else if(a.peek()=='['){
                    a.pop();
                }
                else{
                    return false;
                }
            }
            else if(i=='}'){
                if(a.empty()){
                    return false;
                }
                else if(a.peek()=='{'){
                    a.pop();
                }
                else{
                    return false;
                }
            }
            else{
                a.push(i);
            }
        }
        if(a.empty()){
            return true;
        }
        return false;
    }
}