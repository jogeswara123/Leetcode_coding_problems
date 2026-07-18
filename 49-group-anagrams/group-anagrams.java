class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();
        
        for(String i:strs){

            char c[]=i.toCharArray();

            Arrays.sort(c);

            String temp = new String(c);

            map.computeIfAbsent(temp,k -> new ArrayList<>()).add(i);

        }

        return new ArrayList<>(map.values());
        
    }
}