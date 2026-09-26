class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String>i:knowledge){
            map.put(i.get(0),i.get(1));
        }
       int i=0;
        StringBuilder b=new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=i+1;
                while(j<s.length()&&s.charAt(j)!=')'){
                    j++;
                }
                String s1=s.substring(i+1,j);
                if(map.containsKey(s1)){
                    b.append(map.get(s1));
                }
                else{
                    b.append("?");
                }
                i=j+1;
            }
            else{
                b.append(s.charAt(i));
                i++;
            }
        }
        return b.toString();
    }
}