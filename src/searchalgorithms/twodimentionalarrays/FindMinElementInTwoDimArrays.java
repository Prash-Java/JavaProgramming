package searchalgorithms.twodimentionalarrays;

import java.util.Arrays;

public class FindMinElementInTwoDimArrays {
    public static int[][] array = {
            {2,5,99,76},
            {-101,-98},
            {76,-89,-99,92,98}
    };

    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int ans = findMinValue(array);
        System.out.println(ans);
    }

    public static int findMinValue(int[][] arr) {
        int row;
        int col = 0;
        for(row = 0; row < arr.length; row++) {
            for(col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
