class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        for(char i:jewels.toCharArray()){
            map.put(i,0);
        }
        for(char i:stones.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
        }
        int sum=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            sum+=entry.getValue();
        }
        return sum;
    }
}