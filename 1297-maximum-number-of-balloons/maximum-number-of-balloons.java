class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s="balon";
        for(char i:text.toCharArray()){
            if(s.contains(String.valueOf(i))){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int min=Integer.MAX_VALUE;
        min=Math.min(min,map.getOrDefault('b',0));
        min=Math.min(min,map.getOrDefault('a',0));
        min=Math.min(min,map.getOrDefault('n',0));
        min=Math.min(min,map.getOrDefault('l',0)/2);
        min=Math.min(min,map.getOrDefault('o',0)/2);
        return min;
    }
}