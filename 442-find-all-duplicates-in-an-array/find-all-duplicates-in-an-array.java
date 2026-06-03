class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> n= new ArrayList<>();
        Set<Integer> b=new HashSet<>();
        for(int i:nums){
            if(!b.add(i)){
                n.add(i);
            }
            b.add(i);
        }
        return n;
    }
}