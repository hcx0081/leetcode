import java.math.BigDecimal;

/**
 * {@code @Description:} 43.字符串相乘
 */
public class Multiply {
    // public static void main(String[] args) {
    //     System.out.println(multiply("123", "456"));
    // }

    public static String multiply(String num1, String num2) {
        return String.valueOf(new BigDecimal(num1).multiply(new BigDecimal(num2)));
    }
}
