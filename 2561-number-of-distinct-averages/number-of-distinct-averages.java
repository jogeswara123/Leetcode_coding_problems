class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> c=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            double b= (nums[i]+nums[j])/2.0;
             c.add(b);
             i++;
             j--;
        }
        return c.size();
    }
}