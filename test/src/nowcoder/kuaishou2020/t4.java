package nowcoder.kuaishou2020;

public class t4 {
    /**80
     * 获取最大可同事办公员工数
     * @param pos char字符型二维数组 工位分布
     * @return int整型
     */
    public static int GetMaxStaffs (char[][] pos) {
        // write code here
        int rows = pos.length;
        int line = pos[0].length;
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < line; j++) {
                if (pos[i][j] == '.'){
                    ans++;
                    if(i+1<rows-1){
                        pos[i+1][j] = '*';
                    }
                    if (j+1 <line-1){
                        pos[i][j+1] = '*';
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(GetMaxStaffs(new char[][]{{'*','.','*','*','.'},{'*','.','*','*','*'}, {'*','.','*','*','.'}}));
    }
}