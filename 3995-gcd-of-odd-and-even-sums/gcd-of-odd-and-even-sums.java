class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum1=0,sum2=0,x=1,y=2;
        for(int i=0;i<n;i++){
            sum1+=x;
            sum2+=y;
            x+=2;
            y+=2;
        }
        // if(sum1<sum2){
            while(sum2%sum1!=0){
                int temp = sum2%sum1;
                sum2=sum1;
                sum1=temp;
            }
            return sum1;
        // }
        // else{
        //     while(sum1%sum2!=0){
        //         int temp = sum1%sum2;
        //         sum1=sum2;
        //         sum2=temp;
        //     }
        //     return sum2;
        // }
    }
}