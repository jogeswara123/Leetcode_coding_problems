class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int i=0,j=a.length-1;
        boolean f=true,t=true;
        while(i<=j){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                f=false;
            }
            if(a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u'||a[j]=='A'||a[j]=='E'||a[j]=='I'||a[j]=='O'||a[j]=='U'){
                t=false;
            }
            if(f){
                i++;
            }
            if(t){
                j--;
            }
            if(!f&&!t){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                f=true;
                t=true;
                i++;
                j--;
            }

        }
        StringBuilder s1= new StringBuilder();
        for(char k:a){
            s1.append(k);
        }
        return s1.toString();
    }
}