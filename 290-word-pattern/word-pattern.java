class Solution {
    public boolean wordPattern(String pattern, String s) {
       
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> b= new HashMap<>();
        String[] a=s.split(" ");
        int j=0;
         if (pattern.length() != a.length) {
                return false;
            }
        for(char i:pattern.toCharArray()){
            if(map.containsKey(i)){
                  if(!map.get(i).equals(a[j])){
                    return false;
                  }
            }
            else if(b.containsKey(a[j])){
                if(b.get(a[j])!=i){
                    return false;
                }
            }
            else{
                map.put(i,a[j]);
                b.put(a[j],i);
            }
            j++;
        }
        return true;
    }
}