class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for(int i:nums){
            if(!a.add(i)){
                return i;
            }
        }
        return 0;
    }
}