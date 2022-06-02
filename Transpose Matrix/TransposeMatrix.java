public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {

        /* works for square matrix - faster and less space consuming than normal
        int l= matrix.length;
        int mid = l%2 == 0 ? l/2 : (l/2)+1;

        for (int i = 0; i < mid; i++) {
            for (int j = 1; j < l; j++) {
                if (i==j)
                    continue;
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix;
         */

        int res[][]=new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                res[j][i]= matrix[i][j];

        return res;
    }

    public static void main(String[] args) {
        int[][] inp={{1,2,3},{4,5,6},{7,8,9}};
        TransposeMatrix obj = new TransposeMatrix();
        int[][] res;

        res = obj.transpose(inp);
        for (int i = 0; i < res.length ; i++) {
            System.out.println();
            for (int j = 0; j < res[0].length; j++)
                System.out.print(res[i][j] +"  ");
        }
    }
}
