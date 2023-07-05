

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 0, 4, 3, 50, 0, 0, 23, 90, 90};
        int[] nums2 = {4, 6, 3, 7};
        int[] nums3 = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
        int[] nums4 = {16, 17, 4, 3, 5, 2};
        int[] nums5 = {1, 2, 3, 4, 5, 2};
        int[] nums6 = {2, 3, 5, 9, 14, 16, 18};

        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};

//        ArraysClass.sortTheArrayWithBubbleSort(nums3);
//        ArraysClass.sortTheArrayWithCyclicSort(nums3);
//        ArraysClass.countTheNumberOfPossibleTriangles(nums2);
//        ArraysClass.printAllDistinctElementsOfAGivenIntegerArray(nums);
//        ArraysClass.leadersInAnArray(nums5);

//        StringClass.numberOfSeniorCitizens(details);

//        LinkedListClass.searchForAnElementInALinkedList(35);
//        System.out.println(BinarySearch.binarySearch(nums3, 6));
        System.out.println(BinarySearch.binarySearchWithCeiling(nums6, 33));

    }
}