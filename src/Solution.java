class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int last = nums[0];
        while(j < nums.length){
            if(nums[j] != last)
                last = nums[i++] = nums[j++];
            else
                j++;
        }
        return i;
    }
}