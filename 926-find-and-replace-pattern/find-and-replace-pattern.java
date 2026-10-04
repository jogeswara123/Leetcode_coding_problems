class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> a = new ArrayList<>();
        for(String i:words){
            Map<Character,Character> map = new HashMap<>();
           Map<Character,Character> map2 = new HashMap<>();
            boolean f =true;
            if(i.length()==pattern.length()){
               for(int j=0;j<pattern.length();j++){
                 if(map.containsKey(pattern.charAt(j))){
                    if(map.get(pattern.charAt(j))!=i.charAt(j)){
                        f=false;
                        break;
                    }
                 }
                 else if(map2.containsKey(i.charAt(j))){
                    if(map2.get(i.charAt(j))!=pattern.charAt(j)){
                        f=false;
                        break;
                    }
                 }
                  else{
                        map.put(pattern.charAt(j),i.charAt(j));
                        map2.put(i.charAt(j),pattern.charAt(j));
                    }
               }
               if(f){
                a.add(i);
               }
            }
        }
        return a;
    }
}