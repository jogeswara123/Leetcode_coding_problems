class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        int b[]=new int[2];
        for(int i:nums){
            if(a.containsKey(i)){
                b[0]=i;
            }
            else{
                a.put(i,0);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!a.containsKey(i)){
                b[1]=i;
                return b;
            }
        }
        return new int[]{};
    }
}