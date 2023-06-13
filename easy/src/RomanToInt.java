/**
 * {@code @Description:} 13.罗马数字转整数
 */
public class RomanToInt {
    // public static int romanToInt(String s) {
    //     int sum = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) == 'I') {
    //             /*
    //              * 假设字符串为：IIII
    //              * 那么需要在第3个I之前包括第3个I才可以进行判断下一个字符，否则越界
    //              * 0123，长度为4
    //              * 下标最多为2
    //              *  */
    //             if (i <= s.length() - 2) {
    //                 if (s.charAt(i + 1) == 'V') {
    //                     i++;
    //                     sum += 4;
    //                     continue;
    //                 }
    //                 if (s.charAt(i + 1) == 'X') {
    //                     i++;
    //                     sum += 9;
    //                     continue;
    //                 }
    //             }
    //
    //             sum += 1;
    //         }
    //         if (s.charAt(i) == 'V') {
    //             sum += 5;
    //         }
    //         if (s.charAt(i) == 'X') {
    //             if (i <= s.length() - 2) {
    //                 if (s.charAt(i + 1) == 'L') {
    //                     i++;
    //                     sum += 40;
    //                     continue;
    //                 }
    //                 if (s.charAt(i + 1) == 'C') {
    //                     i++;
    //                     sum += 90;
    //                     continue;
    //                 }
    //             }
    //
    //             sum += 10;
    //         }
    //         if (s.charAt(i) == 'L') {
    //             sum += 50;
    //         }
    //         if (s.charAt(i) == 'C') {
    //             if (i <= s.length() - 2) {
    //                 if (s.charAt(i + 1) == 'D') {
    //                     i++;
    //                     sum += 400;
    //                     continue;
    //                 }
    //                 if (s.charAt(i + 1) == 'M') {
    //                     i++;
    //                     sum += 900;
    //                     continue;
    //                 }
    //             }
    //
    //             sum += 100;
    //         }
    //         if (s.charAt(i) == 'D') {
    //             sum += 500;
    //         }
    //         if (s.charAt(i) == 'M') {
    //             sum += 1000;
    //         }
    //     }
    //     return sum;
    // }
    
    
    public static int romanToInt(String s) {
        s = s.replace("IV", "a");
        s = s.replace("IX", "b");
        s = s.replace("XL", "c");
        s = s.replace("XC", "d");
        s = s.replace("CD", "e");
        s = s.replace("CM", "f");
        
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += getValue(s.charAt(i));
        }
        return res;
    }
    
    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'a':
                return 4;
            case 'b':
                return 9;
            case 'c':
                return 40;
            case 'd':
                return 90;
            case 'e':
                return 400;
            case 'f':
                return 900;
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}