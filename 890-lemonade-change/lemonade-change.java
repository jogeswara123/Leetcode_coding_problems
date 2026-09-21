class Solution {
    public boolean lemonadeChange(int[] bills) {
       int a[]=new int[3];
       for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
            a[0]++;
        }
        else if(bills[i]==10){
            a[0]--;
            a[1]++;
            if(a[0]<0){
                return false;
            }
        }
        else if(bills[i]==20){
            if(a[0]==0){
                return false;
            }
            else if(a[1]==0){
                if(a[0]<3){
                    return false;
                }
                else{
                    a[0]=a[0]-3;
                }
            }
            else{
                a[1]--;
                a[0]--;
                a[2]++;
            }
        }
       }
       return true;
        
    }
}