package MedianOfTwoShortedArray_4;

import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, result, 0, num1.length);
        System.arraycopy(num2, 0, result, num1.length, num2.length);
        Arrays.sort(result);
        int n = result.length;
        if (n % 2 != 0) {
            return result[n / 2];
        }

        else {
            return (result[(n / 2) - 1] + result[n / 2]) / 2.0;
        }
    }
}