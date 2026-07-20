class Solution {
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max=-1;
       for (int num : nums) {
            int sum = digitSum(num);

            if (map.containsKey(sum)) {
                max = Math.max(max, map.get(sum) + num);
                map.put(sum, Math.max(map.get(sum), num));
            } else {
                map.put(sum, num);
            }
        }
       return max;
    }
}