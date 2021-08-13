package offer;

/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class offer_58 {
    public static String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length() + n; i++) {
            sb.append(s.charAt((i % s.length())));
        }
        System.out.println("abcdefg".substring(0, 3));
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = reverseLeftWords("abcdefg", 2);
        System.out.println(s);
    }
}
