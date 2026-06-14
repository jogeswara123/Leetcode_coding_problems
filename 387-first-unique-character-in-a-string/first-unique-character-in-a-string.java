class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char a[]=s.toCharArray();
        for(char i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        char j='a';
       int m=s.length()+1;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
              if(s.indexOf(entry.getKey())<m){
                m=s.indexOf(entry.getKey());
              }
            }
        }
       if(m!=s.length()+1){
        return m;
       }
       else{
        return -1;
       }
    }
}