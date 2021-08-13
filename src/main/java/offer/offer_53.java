package offer;

/**
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */
public class offer_53 {
    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    public int helper(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }



    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(new offer_53().search(nums, 8));
    }
}
