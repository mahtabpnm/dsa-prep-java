package arrays;

public class TwoPointersPairs {
    public static void findPairs(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println(nums[left] + " " + nums[right]);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 8;
        findPairs(nums, target);
    }
}
