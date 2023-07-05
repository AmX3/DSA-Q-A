import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
//        binary search only works on sorted array
//        return the index
//        return -1 if it does not exist
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
// (start + end)/2 may exceed the int range if start and end are really large elements
        while(start <= end) {
            int middle = start + (end - start)/2;

            if(target < arr[middle]) {
                end = middle - 1;
            } else if(target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static int binarySearchWithCeiling(int[] arr, int target) {
//        binary search only works on sorted array
//        return the index
//        return -1 if it does not exist
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        while(start <= end) {
            int middle = start + (end - start)/2;

            if(target < arr[middle]) {
                end = middle - 1;
            } else if(target > arr[middle]) {
                start = middle + 1;
            } else if(target == arr[middle]){
                return middle;
            } else {
                return start;
            }
        }

        return arr[start];
    }

}
