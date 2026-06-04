class Solution {
    public String[] findRelativeRanks(int[] score) {
       int b[]=new int[score.length];
       for(int i=0;i<score.length;i++){
        b[i]=score[i];
       }
       Arrays.sort(b);
       String c[]=new String[score.length];
       int l=0;
       for(int i=score.length-1;i>=0;i--){
              for(int j=0;j<score.length;j++){
                if(b[i]==score[j]){
                    l++;
                    if(l==1){
                        c[j]="Gold Medal";
                        break;
                    }
                    else if(l==2){
                        c[j]="Silver Medal";
                        break;
                    }
                    else if(l==3){
                        c[j]="Bronze Medal";
                        break;
                    }
                    else{
                        c[j]=Integer.toString(l);
                        break;
                    }
                }
              }
       }
       return c;
    }
}