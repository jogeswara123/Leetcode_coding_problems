class Solution {
    public boolean digitCount(String num) {
        char a[]=num.toCharArray();
        Map<Character,Integer> b = new HashMap<>();
        for(char i:a){
            b.put(i,b.getOrDefault(i,0)+1);
        }
       char j='0';
       for(char i:a){
         if((i - '0')!=b.getOrDefault(j,0)){
            return false;
         }
         j++;
       }
       return true;
    }
}