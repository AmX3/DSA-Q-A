package ArraysLeetCode;

import java.util.Arrays;

public class EasyQ {

    public static void main(String[] args) {

    }
//    https://leetcode.com/problems/build-array-from-permutation/
    public int[] buildArrayFromPermutation(int[] nums) {
        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            newArr[i] = nums[nums[i]];
        }

        return newArr;
    }

//    https://leetcode.com/problems/concatenation-of-array/
    public int[] getConcatenationOfArray(int[] nums) {
        int[] newArr = Arrays.copyOf(nums, nums.length * 2);
        int start = nums.length;
        for(int i = 0; i < nums.length; i++) {
            newArr[start++] = nums[i];
        }
        return newArr;
    }

//    https://leetcode.com/problems/running-sum-of-1d-array/
    public int[] runningSum(int[] nums) {
    // Set a counter which keeps the sum of the previous numbers
    // Create a for loop and iterate through each num on each loop, and set the total to each index of the array
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            counter += nums[i];
            nums[i] = counter;
        }
        return nums;

    }
}
