class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
       Set<Integer> a=new LinkedHashSet<>();
       for(int i:nums){
        a.add(i);
       }
       int b[]=new int[a.size()];
       int j=0;
       for(int i:a){
         b[j]=i;
         j++;
       }
       if(b.length>=3){
        return b[b.length-3];
       }
       else{
        return b[b.length-1];
       }
    }
}