class Solution {
    public boolean isGood(int[] nums) {
       Arrays.sort(nums);
        int n = nums.length - 1;
        if(n==0){
            return false;
        }
        if (nums[n] != nums[n - 1]) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return true;
    }
}