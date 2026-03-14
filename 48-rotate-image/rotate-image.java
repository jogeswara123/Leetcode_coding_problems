class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>-1;j--){
                if(i>=j){
                    continue;
                }
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int k=0;k<n;k++){
        int i=0,j=n-1;
        while(i<j){
            int temp=matrix[k][i];
            matrix[k][i]=matrix[k][j];
            matrix[k][j]=temp;
            i++;
            j--;
        }
        }
        
    }
}