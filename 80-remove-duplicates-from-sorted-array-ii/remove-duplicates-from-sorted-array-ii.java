class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length){
            if(left < 2 || nums[left-2] != nums[right]) { //first 2 elements, add em (in range 0-2 if nums[0],nums[1],nums[2] are same, then only nums[0]==nums[2], so then u should keep next non-duplicate in duplicate place)
                nums[left] = nums[right]; //right always points at non-duplicate when given condition is true
                left++; //move left after adding an element
            }
            right++; //iterate
        }
        return left; //keeps track of non-duplicates
    }
}