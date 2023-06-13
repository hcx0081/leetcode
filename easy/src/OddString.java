import java.util.*;

/**
 * {@code @Description:} 2451.差值数组不同的字符串
 */
public class OddString {
    public static void main(String[] args) {
        String[] words = {"nnnmmmnnmmmmmmmmmmnm",
                "iiihhhiihhhhhhhhhhih", "aaaabbbbbbaaabaaaabb",
                "qqqpppqqppppppppppqp", "eeedddeedddddddddded",
                "eeedddeedddddddddded", "iiihhhiihhhhhhhhhhih",
                "lllkkkllkkkkkkkkkklk", "sssrrrssrrrrrrrrrrsr",
                "sssrrrssrrrrrrrrrrsr", "jjjiiijjiiiiiiiiiiji",
                "nnnmmmnnmmmmmmmmmmnm", "xxxwwwxxwwwwwwwwwwxw",
                "eeedddeedddddddddded", "zzzyyyzzyyyyyyyyyyzy",
                "wwwvvvwwvvvvvvvvvvwv", "cccbbbccbbbbbbbbbbcb",
                "xxxwwwxxwwwwwwwwwwxw", "cccbbbccbbbbbbbbbbcb",
                "yyyxxxyyxxxxxxxxxxyx", "hhhggghhgggggggggghg"
        };
        System.out.println(oddString(words));
    }
    
    public static String oddString(String[] words) {
        // 第一个参数：插值数组
        // 第二个参数：数组元素、出现次数
        HashMap<String, Object[]> hashMap = new HashMap<>();
        
        for (String word : words) {// "adc"
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < word.length() - 1; i++) {
                // 计算差值
                int d = word.charAt(i + 1) - word.charAt(i);
                
                list.add(d);
            }
            
            // 差值数组
            Object[] arr = list.toArray();
            
            // 数组地址不同，不能存入地址，所以转换为字符串存入
            Object[] obj = hashMap.get(Arrays.toString(arr));
            if (obj != null) {
                hashMap.put(Arrays.toString(arr), new Object[]{word, (Integer) obj[1] + 1});
            } else {
                hashMap.put(Arrays.toString(arr), new Object[]{word, 1});
            }
        }
        
        // 如果只存入1次，表示是唯一元素
        Set<Map.Entry<String, Object[]>> entries = hashMap.entrySet();
        for (Map.Entry<String, Object[]> entry : entries) {
            if ((Integer) entry.getValue()[1] == 1) {
                return (String) entry.getValue()[0];
            }
        }
        return null;
    }
}