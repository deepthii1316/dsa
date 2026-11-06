class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1, total = 0, ans = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length - 2;i++){
            l = i+1;
            r=nums.length-1;
            while (l < r){
                total = nums[i] + nums[l] + nums[r];
                
                if(Math.abs(target - total) < Math.abs(target - ans)) ans = total;
                if(total == target) return total;
                if(total < target) l++;
                else r--;
            }
        }

        return ans;
    }
}