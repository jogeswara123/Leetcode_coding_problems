class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length/2;
      Map<Integer,Integer> map=new HashMap<>();
      int max=Integer.MIN_VALUE;
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        if(max!=i&&map.get(i)>n){
            max=Math.max(i,max);
        }
      }
      return max;
      
    }
}