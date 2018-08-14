import java.util.HashMap;

/**
 * @author kedupmail@gmail.com
 * @date 2018/5/21 14:52
 */
public class _003_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstringHM(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int result = 0;
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (characterIntegerHashMap.containsKey(str.charAt(i))) {
                j = Math.max(j, characterIntegerHashMap.get(str.charAt(i))+ 1);
            }
            characterIntegerHashMap.put(str.charAt(i), i);
            result = Math.max(result, i - j + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = new String("abcabcbb");
        System.out.println(lengthOfLongestSubstringHM(str));
    }
}
