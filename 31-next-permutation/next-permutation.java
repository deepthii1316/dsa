class Solution {
    public void nextPermutation(int[] nums) {
        // Putting It All Together
        // Let's walk through the entire process for 2 1 5 4:

        // Find the breakpoint: 1 (because 1 < 5)
        // Swap 1 with the smallest larger number to its right (4): 2 4 5 1
        // Reverse everything after the original position of 1: 2 4 1 5
        // Final next permutation: 2 4 1 5
        int n = nums.length, ans = nums[0], idx = -1, idxx = -1;
        
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]) {idx = i; break;} //breakpoint found
        }

        if(idx == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        int small = 101;
        for(int j=n-1;j>idx;j--){
            if(nums[j] > nums[idx]) {
                small = nums[j];
                idxx = j; break;
            }
        }

        int temp = nums[idxx];
        nums[idxx] = nums[idx];
        nums[idx] = temp;

        int s = idx+1, e = n-1;
        reverse(nums,idx+1,n-1);
    }
        private void reverse(int[] nums, int s, int e){
            while(s < e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++; e--;
        }
        }
        // return nums;
    
}