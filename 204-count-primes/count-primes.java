class Solution {
    public int countPrimes(int n) {
       if(n<=2){
        return 0;
       }
       boolean a[]=new boolean[n]; 
       Arrays.fill(a,true);
       a[0]=false;
       a[1]=false;
       for(int i=2;i*i<n;i++){
          if(a[i]){
            for(int j=i*i;j<n;j+=i){
                a[j]=false;
            }
          }
       }
       List<Integer> b=new ArrayList<>();
       for(int i=2;i<n;i++){
         if(a[i]){
            b.add(i);
         }
       }
       return b.size();
    }
}