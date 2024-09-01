package searchalgorithms.twodimentionalarrays;

public class FindMaxElementInTwoDimArrays {
    public static int[][] array = {
            {2,5,99,76},
            {-101,-98},
            {76,-89,-99,92,98}
    };

    public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int ans = findMaxValue(array);
        System.out.println(ans);
    }
    public static int findMaxValue(int[][] arr) {
        int row;
        int col = 0;
        for(row = 0; row < arr.length; row++) {
            for(col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
