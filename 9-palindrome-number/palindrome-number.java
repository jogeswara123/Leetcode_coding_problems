class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s= String.valueOf(x);
        StringBuilder s1= new StringBuilder(s);
        s1.reverse();
        String s2=s1.toString();
        return s.equals(s2);
    }
}