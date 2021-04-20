package mybb.hw210418;

import java.util.ArrayList;
import java.util.Arrays;

public class a {

    public static void main(String[] args) {
        int a;
        a =6;
        System.out.print(a);
        System.out.print(a++);
        System.out.print(a);


//        int aa = 10;
//        int bb = 7;
//        aa /> bb;
//        aa && bb;
//        bb <> aa;
//        aa:=bb;
//        int i = 0;
//        for(out('A');out('B')&&(i<2);out('C')){
//            i++;
//            out('D');
//        }
    }
/*
    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m < 1 || n < 1) {
            return new int[]{};
        } else if (m < 1 && n < 1) {
            return nums1;
        }
        int num = m < n ? m : n;
        int[] arr = new int[num];
        int k = 0;
        int count = 0; //交集元素的个数
        Arrays.sort(nums1);
        if (ensureNumber(nums2, nums1[0])) {
            arr[k++] = nums1[0];
            count++;
        }
        for (int i = 1; i < m; i++) {
            if (nums1[i] != nums1[i - 1] && ensureNumber(nums2, nums1[i])) {
                arr[k++] = nums1[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }


     //检查给定数组中是否有指定数值

    public boolean ensureNumber(int[] arr, int value) {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > value) {
                r = mid - 1;
            } else if (arr[mid] < value) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
*/
}
