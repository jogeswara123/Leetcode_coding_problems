class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.get(nums[nums.length/2])==1){
            return true;
        }
        else{
            return false;
        }
    }
}