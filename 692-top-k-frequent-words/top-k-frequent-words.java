class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<String,Integer>> a = new ArrayList<>(map.entrySet());
        a.sort((x, y) -> {
    if (!x.getValue().equals(y.getValue())) {
        return y.getValue() - x.getValue();
    }
    return x.getKey().compareTo(y.getKey());
});

List<String> b = new ArrayList<>();

for (int j = 0; j < k; j++) {
    b.add(a.get(j).getKey());
}

return b;
    }
}