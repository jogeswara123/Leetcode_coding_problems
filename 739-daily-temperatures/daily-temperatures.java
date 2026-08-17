class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int a[]=new int[temperatures.length];
      Arrays.fill(a,0);
      Stack<Integer> b = new Stack<>();
      for(int i=0;i<temperatures.length;i++){
          while(!b.isEmpty()&&temperatures[i]>temperatures[b.peek()]){
            int p=b.pop();
            a[p]=i-p;
          }
          b.push(i);
      }
      return a;
    }
}