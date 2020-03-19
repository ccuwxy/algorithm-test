package leetcode.leetcode695;

/**
 * 695. 岛屿的最大面积
 * 给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
 *
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *  [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 *
 */
public class Solution695 {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int max = 0;
            for(int i = 0; i < grid.length;i++){
                for(int j = 0; j < grid[0].length;j++){
                    if(grid[i][j]==1){
                        max = Math.max(dfs(grid,i,j),max);
                    }
                }
            }
            return max;
        }
        public int dfs(int[][] grid,int i,int j){
            if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]==0){
                return 0;
            }
            grid[i][j] = 0;
            int count = 1;
            count += dfs(grid,i+1,j);
            count += dfs(grid,i-1,j);
            count += dfs(grid,i,j+1);
            count += dfs(grid,i,j-1);
            return count;
        }
    }
}
