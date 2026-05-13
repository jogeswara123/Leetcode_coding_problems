class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> b=new ArrayList<>();
            b.add(1);
            if(a.size()!=0){
            for(int j=0;j<a.get(i-1).size()-1;j++){
                int c=a.get(i-1).get(j)+a.get(i-1).get(j+1);
                b.add(c);
            }
            b.add(1);
            a.add(b);
            }
            else{
                a.add(b);
            }

        }
        return a.get(rowIndex);
    }
}