package problem_009;

/**
 * @author kedupmail@gmail.com
 * @date 2018/5/24 15:33
 */
public class PalindromeNumber {

    public static boolean isPalindromeNumber(int num) {
        if (num < 0 || num == 0) {
            return false;
        }
        int res = 0;
        int palin = num;
        while (num > 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return palin == res;
    }

    public static void main(String[] args) {
        int num = 123321;
        System.out.println(isPalindromeNumber(num));
    }
}
