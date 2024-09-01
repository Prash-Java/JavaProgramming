package searchalgorithms.linearsearchalgorithms;

public class LinearSearchAlgoInRange {
    public static int[] array = {18,12,27,-7,98,-4,-9,-1};
    public static int target = -9;

    public static void main(String[] args) {
        System.out.println("The Index Is: " + searchTargetInGivenRange(array, target, 2, 6));
        System.out.println("The Index Is: " + searchTargetInGivenRange(array, target, 1,5));
    }

    public static int searchTargetInGivenRange(int[] arr, int target, int start, int end) {
        if(arr.length < 1) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}


