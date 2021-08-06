package leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/next-permutation/
 */
public class P_031 {
    // 思路：从后向前找到升序子序列，然后确定调整后子序列的最高位，剩余部分升序排列
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = n - 2;
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }
        // 如果k = -1，说明所有数降序排列，改成升序排列
        if (k == -1) {
            Arrays.sort(nums);
            return;
        }
        int i = k + 2;
        while (i < n && nums[i] > nums[k]) {
            i++;
        }
        int temp = nums[k];
        nums[k] = nums[i - 1];
        nums[i - 1] = temp;

        int start = k + 1;
        int end = n - 1;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void nextPermutation1(int[] nums) {
        int n = nums.length;
        int k = n - 2;
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }
        if (k == -1) {
            Arrays.sort(nums);
            return;
        }
        int i = k + 2;
        while (i < n && nums[i] > nums[k]) {
            i++;
        }
        int temp = nums[k];
        nums[k] = nums[i - 1];
        nums[i - 1] = temp;
        int start = k + 1;
        int end = n - 1;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation1(nums);
        System.out.println(Arrays.toString(nums));
    }
}
