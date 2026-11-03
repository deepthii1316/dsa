class Solution {
    public static void swap(int i, int j, int[]nums){

    }
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length-1,i=0;
        while(i <= right){
            if(nums[i]==0){
                
                
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;

                left++;
                i++;
            }

            else if(nums[i]==1){
                i++;
            }

            else if(nums[i]==2){
                

                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;

                right--;
            }
        }
    }
}