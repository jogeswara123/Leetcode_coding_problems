class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map = new HashMap<>();
        List<String> a = new ArrayList<>();
        int max=0;
        for(int i=0;i<responses.size();i++){
            Set<String> b = new HashSet<>();
            for(int j=0;j<responses.get(i).size();j++){
                if(b.add(responses.get(i).get(j)))
                map.put(responses.get(i).get(j),map.getOrDefault(responses.get(i).get(j),0)+1);
            }
        }
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==max){
                a.add(entry.getKey());
            }
        }
        Collections.sort(a);
        return a.get(0);
    }
}