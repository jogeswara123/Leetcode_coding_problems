class Solution {
    public int maximumLengthSubstring(String s) {
        char a[] = s.toCharArray();
        int max=1;
       Map<Character,Integer> map = new HashMap<>();
       int left=0;
       for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
          while(map.get(a[i])>2){
            map.put(a[left],map.get(a[left])-1);
            left++;
          }
          max=Math.max(max,i-left+1);
       }
       return max;
    }
}