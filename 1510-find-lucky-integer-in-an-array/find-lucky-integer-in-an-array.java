class Solution {
    public int findLucky(int[] arr) {
        int a[]=new int[501];
        int max=-1;
        for(int i:arr){
            a[i]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==i){
                max=a[i];
            }
        }
        return (max==0)?-1:max;
    }
}