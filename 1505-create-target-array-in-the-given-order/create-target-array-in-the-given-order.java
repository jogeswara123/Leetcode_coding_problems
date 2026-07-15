class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int a[]=new int[nums.length];
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
              b.add(index[i],nums[i]);
        }
        int j=0;
        for(int i:b){
            a[j]=i;
            j++;
        }
        return a;
    }
}