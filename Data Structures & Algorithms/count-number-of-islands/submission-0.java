class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; 
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        grid[i][j] = '0';
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];
            for(int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];
                if(newRow >= 0 && newRow < grid.length &&
                   newCol >= 0 && newCol < grid[0].length &&
                   grid[newRow][newCol] == '1') {
                    queue.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }
}
