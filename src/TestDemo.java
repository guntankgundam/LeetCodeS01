/**
 * @author kedupmail@gmail.com
 * @date 2018/7/6 16:40
 */
public class TestDemo {
    private static int j = 0;

    private static Boolean methodB(int k) {
        j += k;
        return true;
    }

    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);

    }

    public static void main(String args[]) {
        methodA(0);
        System.out.println(j);
    }
}
