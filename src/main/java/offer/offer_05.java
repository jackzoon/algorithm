package offer;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * 替换空格
 */
public class offer_05 {
    public String replaceSpace(String s) {
        int n = s.length();
        char[] arr = new char[n * 3];
        int size = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            } else {
                arr[size++] = c;
            }
        }
        return new String(arr, 0, size);
    }

    public static void main(String[] args) {
        System.out.println(new offer_05().replaceSpace("We are happy."));
    }
}
