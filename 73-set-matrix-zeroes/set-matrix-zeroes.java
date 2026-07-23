class Solution {
    public static void setz(int a[][],int m,int n){
        for(int i=0;i<a[0].length;i++){
            a[m][i]=0;
        }
        for(int i=0;i<a.length;i++){
            a[i][n]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    setz(a,i,j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
}