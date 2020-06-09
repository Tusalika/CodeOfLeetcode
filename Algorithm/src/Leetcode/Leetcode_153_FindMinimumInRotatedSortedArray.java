package Leetcode;

public class Leetcode_153_FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        else if (nums.length != 0) {
            int position = 0;//找到转折点
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[0]) {
                    position = i;
                    return nums[i];
                }
            }
            if (position == 0) {
                return nums[0];
            }
        }
        return nums[0];
    }

    public int findMin1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }

        while (right > -left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
        return -1;
    }

    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

        if (key < arr[low] || key > arr[high] || low > high) {
            return 0;
        }

        int middle = (low + high) / 2;            //初始中间位置
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }

    }
}
