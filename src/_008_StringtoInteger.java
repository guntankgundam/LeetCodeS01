/**
 * @author kedupmail@gmail.com
 * @date 2018/5/22 21:06
 */
public class _008_StringtoInteger {
    public static int stringToInteger(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        // 去除输入参数前后的空格
        str = str.trim();
        char firstChar = str.charAt(0);
        int start = 0;
        int sign = 1;
        long res = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) res * sign;
            }
            res = res * 10 + str.charAt(i) - '0';
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) res * sign;
    }

    public static void main(String[] args) {
        String string = "2521dd";
        System.out.println(stringToInteger(string));
    }
}
