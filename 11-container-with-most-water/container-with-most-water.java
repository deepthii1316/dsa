class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, res = Integer.MIN_VALUE;
        while(left < right){
            int breadth;
            if(height[left]<=height[right]) breadth = height[left];
            else breadth = height[right];

            int area = (right - left) * breadth;

            res = Math.max(area, res);
            if(height[left] < height[right]) left++;
            else right--;
        }

        return res;
    }
}