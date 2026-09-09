class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> a = new Stack<>();
        int b[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!a.isEmpty()&&temperatures[a.peek()]<=temperatures[i]){
                 a.pop();
            }
            if(!a.isEmpty()){
                b[i]=a.peek()-i;
            }
            a.push(i);

        }
        return b;
    }
}