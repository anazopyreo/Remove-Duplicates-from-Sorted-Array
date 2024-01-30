public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] expectedNums1 = {1,2};
        System.out.println(testSolution(nums1, expectedNums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums2 = {0,1,2,3,4};
        System.out.println(testSolution(nums2, expectedNums2));
    }

    private static boolean testSolution(int[] nums, int[] expectedNums){
        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);
        if(k != expectedNums.length)
            return false;
        for (int i = 0; i < k; i++)
            if(nums[i] != expectedNums[i])
                return false;
        return true;
    }
}