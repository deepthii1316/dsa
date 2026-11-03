class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length){
            if(left < 2 || nums[left-2] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}