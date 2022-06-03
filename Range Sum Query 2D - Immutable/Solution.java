class NumMatrix {
 int[][] mat;

  public NumMatrix(int[][] matrix) {
    int n = matrix.length, m = matrix[0].length;
    mat = new int[n + 1][m + 1];
    // mat[i][j] represents the sum of the rectangle with the following 4 vertices: (0, 0), (0, j - 1), (i - 1, 0), (i - 1, j - 1)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (j > 0) {
          matrix[i][j] += matrix[i][j - 1];
        }
        mat[i + 1][j + 1] =  matrix[i][j] + (i > 0 ? mat[i][j + 1] : 0);
      }
    }
  }
  
  public int sumRegion(int row1, int col1, int row2, int col2) {
    return mat[row2 + 1][col2 + 1] - mat[row1][col2 + 1] - mat[row2 + 1][col1] + mat[row1][col1];
  }
}
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
