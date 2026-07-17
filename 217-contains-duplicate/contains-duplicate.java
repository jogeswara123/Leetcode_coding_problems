class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> a=new HashSet<>();
       for(int i:nums){
        if(!a.add(i)){
            return true;
        }
       }
        return false;
    }
}