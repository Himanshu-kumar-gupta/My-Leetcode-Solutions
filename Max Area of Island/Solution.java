class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
		// Loop over the Entire Grid
        for(int i=0;i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
			    // only call the dfs call when we encounter a 1, then find the number of connected land and compare it with the previous area
                if(grid[i][j]==1){
                    area= Math.max(area, dfs(grid, i, j));
                }
            }
        }
        return area;
    }
    
    public int dfs(int[][] grid, int i, int j){
		// if we gets out of bound or its a 0 i.e. water then return 0
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) return 0;
		// if not then mark the grid value to 0 to make sure we do not come back to the same piece of land and cause infinite recursion i.e. stack over flow
        grid[i][j]=0;
		// now just go to all 4 direction get the respective counts and add it all together and return it
        return 1+ dfs(grid, i-1, j)+ dfs(grid, i+1, j)+ dfs(grid, i, j-1)+ dfs(grid, i, j+1);
    }
}
