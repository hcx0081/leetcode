import java.util.Arrays;

/**
 * {@code @Description:} 27.移除元素
 */
public class RemoveElement {
    public static void main(String[] args) {
        int i = removeElement(new int[]{3, 2, 2, 3}, 2);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
