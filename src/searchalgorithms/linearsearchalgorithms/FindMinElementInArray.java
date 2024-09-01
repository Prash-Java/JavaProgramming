package searchalgorithms.linearsearchalgorithms;

public class FindMinElementInArray {
    public static int[] array = {18,12,27,-7,98,-4,-9,-1};
    public static int min = array[0];

    public static void main(String[] args) {
        System.out.println("Min Element Is: " + minElement(array));
    }

    public static int minElement(int[] arr) {
        if(arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        for(int element : arr) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }
}
