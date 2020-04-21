package practice;

public class minK {
    public static void main(String[] args) {
        int k = 4;
        int[] a = {10,1,2,3,4,0,6,7,8,9};
        int n = a.length;
        int[] b = new int[k];
        b = findKthNumbers(a,n,k);
        for (int i = 0; i < k; i++) {
            System.out.println(b[i]);
        }

    }

    public static int[] findKthNumbers(int[] input, int n, int k) {
        if (input == null || n <= k || k < 1) {
            return input;
        }
        int[] result = new int[k];
        int start = 0, end = input.length - 1, key, i, j;
        while (end != k - 1) {
            key = input[start];
            i = start;
            j = end;
            while (i < j) {
                while (i < j && input[j] >= key) {
                    j--;
                }
                input[i] = input[j];
                while (i < j && input[i] <= key) {
                    i++;
                }
                input[j] = input[i];
            }
            input[i] = key;
            if (i == k - 1)
                break;
            if (i > k - 1)
                end = i - 1;
            else
                start = i + 1;
        }
        for (i = 0; i < k; i++) {
            result[i] = input[i];
        }
        return result;
    }

}
