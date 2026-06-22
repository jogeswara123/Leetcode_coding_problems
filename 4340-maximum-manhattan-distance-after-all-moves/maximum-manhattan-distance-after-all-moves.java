class Solution {
    public int maxDistance(String moves) {
       int x=0,y=0;
        int c=0;
        for(char i:moves.toCharArray()){
            if(i=='U'){
                x+=1;
            }
            else if(i=='D'){
                x-=1;
            }
            else if(i=='L'){
                y-=1;
            }
            else if(i=='R'){
                y+=1;
            }
            else{
                c++;
            }
        }
        return Math.abs(x)+Math.abs(y)+c;
    }
}