class Solution {
    public int countKthRoots(int l, int r, int k) {

        if(k==1)
            return r-l+1;
        int n=(int)Math.ceil(Math.pow(l,1.0/k));
int c=0;

for(int i=n;i<=r;i++){
    long b=(long)Math.pow(i,k);

    if(b>=l && b<=r){
        c++;
    }
    else if(b>r){
        break;
    }
}

return c;
    }
}