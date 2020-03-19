package leetcode.leetcode200;

/**
 * 200. 岛屿数量
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
 * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
 * 你可以假设网格的四个边均被水包围。
 *
 * 示例 1:
 *
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * 输出: 1
 * 示例 2:
 *
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * 输出: 3
 */
public class Solution200 {
    public static void main(String[] args) {
        Solution200.Solution s = new Solution200().new Solution();
        char[][] a = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(s.numIslands(a));
        System.out.println(s.numIslands(a));

    }

    class Solution {
        public int numIslands(char[][] grid) {
            int count = 0;
            for(int i = 0; i < grid.length;i++){
                for(int j = 0; j < grid[0].length; j++){
                    if(grid[i][j]=='1'){
                        dfs(grid,i,j);
                        count++;
                    }
                }
            }
            return count;
        }
        public int dfs(char[][] grid,int i,int j){
            if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]=='1'){
                return 0;
            }
            grid[i][j] = '0';
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
            return 1;
        }
    }
}
