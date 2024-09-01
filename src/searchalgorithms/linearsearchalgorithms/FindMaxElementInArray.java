package searchalgorithms.linearsearchalgorithms;

public class FindMaxElementInArray {

    public static int[] array = {18,12,27,-7,98,-4,-9,-1};
    public static int max = array[0];

    public static void main(String[] args) {
        System.out.println("Max Element Is: " + maxElement(array));
    }
    public static int maxElement(int[] arr) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for(int element : arr) {
            if(element > max) {
                max = element;
            }
        }
        return max;
    }
}
