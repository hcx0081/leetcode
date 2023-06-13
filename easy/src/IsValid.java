import java.util.Stack;

/**
 * {@code @Description:} 20.有效的括号
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            // 碰到左括号，就把相应的右括号入栈
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || ch != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }
        // 最后判断栈中元素是否匹配
        return stack.isEmpty();
    }
    
    
}