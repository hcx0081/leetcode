import java.util.HashMap;

/**
 * {@code @Description:} 387.字符串中的第一个唯一字符
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    
    public static int firstUniqChar(String s) {
        // 字符、标志
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, 0);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // public static int firstUniqChar(String s) {
    //     for (int i = 0; i < s.length(); i++) {
    //         // 查找第一次出现的索引位置
    //         int first = s.indexOf(s.charAt(i));
    //         // 查找最后一次出现的索引位置
    //         int last = s.lastIndexOf(s.charAt(i));
    //         if (first == last) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}