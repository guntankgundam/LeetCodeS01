import java.util.HashMap;
import java.util.Scanner;

public class _001_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;

    }

    public static void main(String[] args) {

        int[] nums = new int[5];
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数组");
        String str = sc.nextLine();
        String[] strs = str.split(" ");

        for (int i = 0; i < 5; i++) {
            nums[i++] = sc.nextInt();
        }


        System.out.println("请输入 target");
        target = sc.nextInt();


        System.out.println(twoSum(nums, target));
    }
}
