class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            sum+=(entry.getValue()*(entry.getValue()-1))/2;
        }
        return sum;
    }
}