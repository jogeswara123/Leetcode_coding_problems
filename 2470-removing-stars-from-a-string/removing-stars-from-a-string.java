class Solution {
    public String removeStars(String s) {
        Stack<Character> a = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='*'){
                if(!a.isEmpty()){
                    a.pop();
                }
            }
            else{
                a.push(i);
            }
        }
        StringBuilder b = new StringBuilder();
        while(!a.isEmpty()){
            b.append(a.pop());
        }
        return b.reverse().toString();
    }
}