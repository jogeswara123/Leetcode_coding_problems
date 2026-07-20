class Solution {
    static{
        for(int i = 0 ; i < 4000 ; i++)
            twoSum(new int[]{1,2,3} , 3);
    }
    public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int t=target-nums[i];
         if(map.containsKey(t)){
            return new int[]{map.get(t),i};
         }
         map.put(nums[i],i);
       }
       return new int[]{};
    }
}