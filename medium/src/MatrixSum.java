import java.util.Arrays;

/**
 * {@code @Description:} 2679.矩阵中的和
 */
public class MatrixSum {
    public static int matrixSum(int[][] nums) {
        Arrays.stream(nums).forEach(Arrays::sort);
        System.out.println(Arrays.deepToString(nums));
        int sum = 0;
        // 列
        for (int i = 0; i < nums[0].length; i++) {
            int cur = 0;
            // 行
            for (int j = 0; j < nums.length; j++) {
                cur = Math.max(cur, nums[j][i]);
            }
            sum += cur;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(matrixSum(new int[][]{{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}}));
    }
}
