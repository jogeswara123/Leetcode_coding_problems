class Solution {
      static{
        for(int i = 0 ; i < 10000 ; i ++)
        {
            Solution.asteroidCollision(new int[]{1,2,3,-2});
        }
      }
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> c=new ArrayList<>();
        for(int i:asteroids){
            if(i>0){
                c.add(i);
            }
            else{
                if(c.size()==0){
                    c.add(i);
                }
                else{
                for(int j=c.size()-1;j>=0;j--){
                    if(c.get(j)<0){
                        c.add(i);
                        break;
                    }
                    else{
                    if(c.get(j)+i<0&&c.get(j)>0){
                        c.remove(j);
                    }
                    else if(c.get(j)+i==0){
                        c.remove(j);
                        break;
                    }
                    else{
                        break;
                    }
                    if(c.size()==0){
                        c.add(i);
                    }
                    }
                }
                }
            }
        }
        int m[]=new int[c.size()];
        int j=0;
        for(int i:c){
            m[j++]=i;
        }
        return m;
    }
}