class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=2){
                nums[count++]=entry.getKey();
                nums[count++]=entry.getKey();
            }
            else{
                nums[count++]=entry.getKey();
            }
        }
        return count;
    }
}