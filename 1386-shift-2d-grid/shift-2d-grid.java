class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<Integer> a = new ArrayList<>();
        int l=grid.length;
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                a.add(grid[i][j]);
            }
        }
        k %= (l * n);
        for(int i=0;i<k;i++){
            int temp = a.remove(a.size() - 1);
            a.add(0, temp);
        }
        List<List<Integer>> b = new ArrayList<>();
        int m=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> c= new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                   c.add(a.get(m));
                   m++;
            }
            b.add(c);
        }
        return b;
    }
}