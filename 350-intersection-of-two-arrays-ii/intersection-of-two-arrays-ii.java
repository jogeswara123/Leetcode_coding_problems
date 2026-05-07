class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    a.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int b[]=new int[a.size()];
        int j=0;
        for(int i:a){
          b[j]=i;
          j++;
        }
       return b;
    }
}