/**
 * {@code @Description:} 88.合并两个有序数组
 */
public class Merge {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // 二分查找


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums2[j] >= nums1[i]) {
                    // 移动元素
                    for (int k = nums1.length; k > j; k--) {

                    }
                }
            }
        }
    }
}
