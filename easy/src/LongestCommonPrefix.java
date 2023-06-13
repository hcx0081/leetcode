/**
 * {@code @Description:}
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for (String str : strs) {
            while (!str.startsWith(common)) {
                common = common.substring(0, common.length() - 1);
            }
        }
        return common;
    }
}