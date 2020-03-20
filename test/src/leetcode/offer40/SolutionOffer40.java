package leetcode.offer40;

import java.util.Arrays;

/**
 * 面试题40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 */
public class SolutionOffer40 {
    public static void main(String[] args) {
         Solution s = new Solution();
         int[] a = s.getLeastNumbers(new int[]{5,1,2,3,4,6,10},3);
        for (int value : a) {
            System.out.println(value);
        }
    }

}

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
//        int len = arr.length;
//        int min = arr[0];
//        int minIndex = 0;
//        for (int i = 0; i < k; i++) {
//            min = arr[i];
//            minIndex = i;
//            for (int j = i+1; j <len; j++) {
//                if(min > arr[j]){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            arr[minIndex] = arr[i];
//            arr[i] = min;
//        }
//        int[] array = new int[k];
//        for (int i = 0; i < k; i++) {
//            array[i] = arr[i];
//        }
//        return array;
        quickSelect(arr,0,arr.length-1,k);
        return Arrays.copyOf(arr,k);
    }
    private void quickSelect(int[] nums, int start, int end, int k) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int pivot = nums[(left + right) / 2];
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        if (right >= k) {
            quickSelect(nums, start, right, k);
        } else {
            quickSelect(nums, left, end, k);
        }
    }
}
