class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a=new ArrayList<>();
        Set<Integer> b=new HashSet<>();
        for(int i:nums){
            b.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(b.add(i)){
                a.add(i);
            }
        }
        return a;
    }
}