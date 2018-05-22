/**
 * @author kedupmail@gmail.com
 * @date 2018/5/22 15:44
 */
public class _007_ReverseInteger {
    public static int reverse(int x) {
        long res=0;
        while (x != 0) {
            res = res * 10 + x % 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int x=-3232422;
        System.out.println(reverse(x));
    }
}
