package maps;

import java.util.Arrays;

    public class TwoSumFinderTest {

        public static void main(String[] args) {
            // Test 1: Valid case with a solution
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            System.out.println("Test 1 - Valid Case:");
            testTwoSumFinder(nums1, target1);

            // Test 2: Valid case with a different solution
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            System.out.println("\nTest 2 - Valid Case with Different Solution:");
            testTwoSumFinder(nums2, target2);

            // Test 3: No solution
            int[] nums3 = {1, 2, 3, 4, 5};
            int target3 = 20;
            System.out.println("\nTest 3 - No Solution:");
            testTwoSumFinder(nums3, target3);

            // Test 4: Empty array
            int[] nums4 = {};
            int target4 = 10;
            System.out.println("\nTest 4 - Empty Array:");
            testTwoSumFinder(nums4, target4);
        }

        private static void testTwoSumFinder(int[] nums, int target) {
            int[] result = TwoSumFinder.findTwoSumIndices(nums, target);
            if (result.length == 2) {
                System.out.println("Indices of two numbers that sum up to " + target + ": " + Arrays.toString(result));
            } else {
                System.out.println("No solution found for the given target " + target);
            }
        }
    }

