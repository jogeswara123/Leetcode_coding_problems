class Solution {
    public int[] separateDigits(int[] nums) {
       List<Integer> a=new ArrayList<>();
       for(int i:nums){
        List<Integer> b=new ArrayList<>();
        while(i!=0){
            int c=i%10;
            b.add(0,c);
            i/=10;
        }
        for(int j:b){
            a.add(j);
        }
       }
       int d[]=new int[a.size()];
       for(int i=0;i<a.size();i++){
        d[i]=a.get(i);
       }
       return d;
    }
}