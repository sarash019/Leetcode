class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[m-1][n-1] == 1 || grid[0][0] == 1)  return 0;


        if(m == 1){
            for(int it : grid[0]){
                if(it == 1){
                    return 0;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = -1;
                }
            }
        }

        grid[m-1][n-1] =  1;


        for(int i = n-2; i >= 0; i--){
            if(grid[m-1][i] != -1){
                if(grid[m-1][i+1] != -1){
                    grid[m-1][i] = grid[m-1][i+1];
                }
            }
        }

        for(int i = m-2; i >= 0; i--){
            if(grid[i][n-1] != -1){
                if(grid[i+1][n-1] != -1){
                    grid[i][n-1] = grid[i+1][n-1];
                }
            }
        }


        for(int i = m-2; i >= 0; i--){
            for(int j = n-2; j >= 0; j--){
                if(grid[i][j] == -1){
                    continue;
                }

                if(grid[i+1][j] == -1 && grid[i][j+1] == -1){
                    grid[i][j] = 0;
                }

                else if(grid[i+1][j] == -1){
                    grid[i][j] = grid[i+1][j] + grid[i][j+1] + 1;
                }

                else if(grid[i][j+1] == -1){
                    grid[i][j] = grid[i+1][j] + grid[i][j+1] + 1;
                }

                else{
                    grid[i][j] = grid[i+1][j] + grid[i][j+1];
                }
            }
        }

        return grid[0][0];
        
    }
}