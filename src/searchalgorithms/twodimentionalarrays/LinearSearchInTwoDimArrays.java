package searchalgorithms.twodimentionalarrays;

import java.util.Arrays;

public class LinearSearchInTwoDimArrays {
    // To search the target element in a given 2-D arrays, if exists, else return -1;
    public static int[][] array = {
            {1,3,98,99},
            {76,96,5,2,9},
            {95,87,92,89,98,654}
    };
    public static int target = 201;

    public static void main(String[] args) {
        int[] ans = findTargetInTwoDimArray(array, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findTargetInTwoDimArray(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
