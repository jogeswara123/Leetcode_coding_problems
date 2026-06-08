class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> c=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                c.add(i);
            }
            else if(i==pivot){
                n.add(i);
            }
            else{
                b.add(i);
            }
        }
        int m[]=new int[nums.length];
        int j=0;
        for(int i:c){
            System.out.print(i);
            m[j++]=i;
        }
        for(int i:n){
            m[j++]=i;
        }
        for(int i:b){
            m[j++]=i;
        }
        return m;
    }
}