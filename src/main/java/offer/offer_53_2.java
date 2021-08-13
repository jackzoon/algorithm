package offer;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class offer_53_2 {
    public static int missingNumber(int[] nums) {
        if (nums.length == 0 && nums[0] == 0) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] map = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            char[] s = new char[a.length()];
            int i = 0;
            for(char c : a.toCharArray()){
                if(c >='A' && c <= 'Z'){
                    c = (char)(c + 33);
                    if(c > 'z'){
                        c = 'a';
                    }
                }else if(c >= 'a' && c <= 'z'){
                    c = (char)('0' + map[c - 'a']);

                }
                s[i++] = c;
            }
            System.out.println(new String(s));
        }
    }
}
