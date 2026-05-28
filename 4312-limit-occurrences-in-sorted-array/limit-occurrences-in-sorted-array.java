class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> m =new ArrayList<>();
       Set<Integer> n=new HashSet<>();
       for(int i:nums){
        n.add(i);
       }
       for(int i:n){
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==i){
                c++;
            }
            
            if(c==k){
                break;
            }
        }
        for(int j=0;j<c;j++){
            m.add(i);
        }
       }
       int h[]=new int[m.size()];
       int l=0;
       for(int i:m){
        h[l++]=i;
       }
       Arrays.sort(h);
       return h;
    }
}