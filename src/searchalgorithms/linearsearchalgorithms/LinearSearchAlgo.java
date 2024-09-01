package searchalgorithms.linearsearchalgorithms;

public class LinearSearchAlgo {
    public static int[] array = {18,12,27,-7,98,-4,-9,-1};
    public static int count = -1;
    public static void main(String[] args) {
        int target = -100;
        System.out.println("Target Present At Index: " + searchElementIndex(array, target));
        System.out.println("Element Is Found: " + searchElement(array, target));
    }

    public static int searchElementIndex(int[] arr, int target) {
        if(arr.length < 1) {
            return -1;
        }
        for(int element : arr) {
           ++count;
           if(element == target) {
               return count;
           }
        }
        return -1;
    }

    public static boolean searchElement(int[] arr, int target) {
        if(arr.length < 1) {
            return false;
        }
        for(int element : arr) {
            if(element == target) {
                return true;
            }
        }
        return false;
    }
}
