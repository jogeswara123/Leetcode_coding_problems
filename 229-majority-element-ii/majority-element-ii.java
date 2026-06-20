class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> a=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int b=nums.length/3;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             if(entry.getValue()>b){
                a.add(entry.getKey());
             }
        }
        return a;
    }
}