class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int b[]  = new int [nums.length];
       for(int i=0;i<nums.length;i++){
         b[i]=nums[i];
       }
       Arrays.sort(b);
       Map<Integer,Integer> a = new HashMap<>();
       for(int i=0;i<b.length;i++){
          if(a.containsKey(b[i])){
            continue;
          }
          else{
            a.put(b[i],i);
          }
       }
       int c[] = new int[nums.length];
       for(int i=0;i<nums.length;i++){
          c[i]=a.get(nums[i]);
       }
        return c;
    }
}