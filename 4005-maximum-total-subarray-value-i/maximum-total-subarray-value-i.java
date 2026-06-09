class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long   b=k*(long)(nums[nums.length-1]-nums[0]);
        return b;
    }
}