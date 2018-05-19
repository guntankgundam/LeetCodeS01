import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 一个while就是一个测试用例
        while(in.hasNext()){
            int n = in.nextInt(); // 该测试用例后续接收的参数个数
            long[] array = new long[n];
            String[] arrayStr = new String[n];
            for(int i=0; i<n; i++){
                arrayStr[i] = in.next();
            }
            for(int i=0; i<n; i++){
                array[i] = in.nextLong();// 取下一个元素转换成long类型
            }

            System.out.println(Arrays.toString(array)+" "+ Arrays.toString(arrayStr));


        }
    }
}
