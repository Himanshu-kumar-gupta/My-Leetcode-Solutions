class Solution {
   public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]dp=new int[m][n];
        for(int[] dp1:dp){
            Arrays.fill(dp1,-1);
        }
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)return 0;
        
        return countPaths(dp,m-1,n-1,obstacleGrid);
    }
    
    int countPaths(int[][]dp,int m,int n,int[][] obstacleGrid){

        if(m<0 || n<0 || obstacleGrid[m][n]==1)return 0;
         if(m==0 && n==0)return 1;
        if(dp[m][n]!=-1)return dp[m][n];
        return dp[m][n]=countPaths(dp,m-1,n,obstacleGrid)+countPaths(dp,m,n-1,obstacleGrid);
        
    }
}
