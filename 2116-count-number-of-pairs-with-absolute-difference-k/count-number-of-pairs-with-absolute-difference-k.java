class Solution {
    public int countKDifference(int[] nums, int k) {
      Map<Integer,Integer> a = new HashMap<>();
      int c=0;
      for(int i:nums){
        a.put(i,a.getOrDefault(i,0)+1);
      }
      for(int i:nums){
        int s=i+k;
        if(a.containsKey(s)){
            c+=a.get(s);
        }
      }
      return c;
    }
}