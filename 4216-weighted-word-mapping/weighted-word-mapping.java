class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String i:words){
            char a[]=i.toCharArray();
            int sum=0;
            for(char j:a){
                sum+=weights[(j-'a')];
            }
            int b=sum%26;
            sb.append((char)(96+(Math.abs(b-26))));
        }
        return sb.toString();
    }
}