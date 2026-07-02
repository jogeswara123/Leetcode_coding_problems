class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a=new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='#'){
                if(a.length()>0)
                a.deleteCharAt(a.length()-1);
            }
            else{
                a.append(i);
            }
        }
        for(char i:t.toCharArray()){
            if(i=='#'){
                if(b.length()>0)
                b.deleteCharAt(b.length()-1);
            }
            else{
                b.append(i);
            }
        }
        return a.toString().equals(b.toString());
    }
}