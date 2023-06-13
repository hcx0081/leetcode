/**
 * {@code @Description:} 58.最后一个单词的长度
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    
    public static int lengthOfLastWord(String s) {
        // 去除前后空格
        String trim = s.trim();
        // 判断最后一个字符串的开头字符的索引位置
        int index = trim.lastIndexOf(" ") + 1;
        return trim.lastIndexOf("") - index;
    }
}