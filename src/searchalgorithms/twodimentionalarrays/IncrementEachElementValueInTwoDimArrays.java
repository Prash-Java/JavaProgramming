package searchalgorithms.twodimentionalarrays;

public class IncrementEachElementValueInTwoDimArrays {
    public static int[][] array = {
            {2,5,99,76},
            {-101,-98},
            {76,-89,-99,92,98}
    };

    public static void main(String[] args) {
        int[][] newArr = incrementEachValueByOne(array, 5);
        for(int row = 0; row < newArr.length; row++) {
            for(int col = 0; col < newArr[row].length; col++) {
                System.out.print(newArr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] incrementEachValueByOne(int[][] arr, int incrementor) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = arr[row][col] + incrementor;
            }
        }
        return arr;
    }
}
