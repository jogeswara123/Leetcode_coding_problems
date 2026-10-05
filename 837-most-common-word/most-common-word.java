class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.toLowerCase();
        String words[] = s.split("\\W+");
        Map<String,Integer> map = new HashMap<>();
        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:banned){
            map.put(i,0);
        }
        int max=0;
        String s2="";
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(max<entry.getValue()){
                s2=entry.getKey();
                max=entry.getValue();
            }
        }
        return s2;
    }
}