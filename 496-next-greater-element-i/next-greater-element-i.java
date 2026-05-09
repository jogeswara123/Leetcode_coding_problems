class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        int k=0;
          for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                k=j;
                break;
            }
          }
          for(int j=k+1;j<nums2.length;j++){
            if(nums1[i]<nums2[j]){
                a[i]=nums2[j];
                k=-1;
                break;
            }
          }
          if(k>-1){
            a[i]=-1;
          }
       }
       return a;
    }
}