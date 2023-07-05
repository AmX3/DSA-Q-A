import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

public class ArraysClass {

    public static void reverseNumArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp;

        while(start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(nums));
    }

    public static void leftRotation(int[] nums, int position) {
        int[] arr = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);

        int[] arr2 = new int[nums.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[position++];
        }

        System.out.println(Arrays.toString(arr2));
    }

    public static void largestThreeElements(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                // swap nums[j] with nums[i]
                Utility.swap(nums, i , j);
                j++;
                System.out.println(Arrays.toString(nums));
            }
        }
    }

    public static void moveZeroesToTheEnd(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] !=0) {
                Utility.swap(nums, j, i);
                j++;
                System.out.println(nums);
            }
        }
    }

    public static void rearrangeArraysSuchThatEvenPositionedAreGreaterThanOdd(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int k = nums.length - 1;
        int ans[] = new int[nums.length];

        for(int i = 0; i < ans.length; i++) {
            if((i +1) % 2 == 0) {
                ans[i] = nums[k--];
            } else {
                ans[i] = nums[j++];
            }
            System.out.println(Arrays.toString(ans));
        }
    }

    public static void rearrangeArrayInMaximumMinimum(int[] nums) {
        int[] temp = nums.clone();
        int min = 0;
        int max = nums.length - 1;
        boolean flag = true;

        for(int i = 0; i < temp.length; i++) {
            if (flag) {
                nums[i] = temp[max--];
            } else {
                nums[i] = temp[min++];
            }

            flag = !flag;
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void segregateEvenAndOddNumbers(int[] nums) {
        // Time Complexity = 0(n) -> for loop
        // Space Complexity = 0(1) -> no extra space is created
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                Utility.swap(nums, i, j);
                j++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void arrayRotation(int[] nums, int d) {
        int[] ans = new int[nums.length * 2];
        int[] result = new int[nums.length];
        int j = d;

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(ans));

        for(int i = 0; i < result.length; i++) {
            result[i] = ans[j++];
        }

        System.out.println(Arrays.toString(result));
    }

    public static void sortTheArrayWithBubbleSort(int[] nums) {
        // bubble sort algorithm
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void sortTheArrayWithCyclicSort(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            int correct = nums[i] - 1;
            System.out.println(correct);

            if(nums[correct] != nums[i]) {
                Utility.swap(nums, i, correct);
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void countTheNumberOfPossibleTriangles(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void printAllDistinctElementsOfAGivenIntegerArray(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }

        for(int i = 0; i < arrayList.size(); i++) {
            treeSet.add(arrayList.get(i));
        }

        System.out.println(treeSet);
    }

    public static void leadersInAnArray(int[] arr) {
        // Time Complexity: O(n) -> iterate through each element once
        // Space Complexity: 0(1)?
        //Method 1: Doesn't retain the order of the elements
//        int length = arr.length;
//        int max = 0;
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i = length - 1; i > 0; i--) {
//            if(arr[i] > max) {
//                result.add(arr[i]);
//                max = arr[i];
//            }
//        }
//        System.out.println(result);

        //Method 2: Retains the order of the elements
        int length = arr.length;
        int max = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = length - 1; i > 0; i--) {
            if(arr[i] > max) {
                stack.push(arr[i]);
                max = arr[i];
            }
        }

        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
