class Solution {
    public int passwordStrength(String password) {
        Set<Character> m=new HashSet<>();
        char n[]=password.toCharArray();
        for(char i:n){
            m.add(i);
        }
        int c=0;
        for(char i:m){
            int b=(int)i;
            if(b>=48&&b<=57){
                c+=3;
            }
            else if(b>=65&&b<=90){
                c+=2;
            }
            else if(b>=97&&b<=122){
                c+=1;
            }
            else{
                c+=5;
            }

        }
        return c;
    }
}