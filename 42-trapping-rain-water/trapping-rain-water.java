class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmax = -1, rmax = -1, s = 0, e = n - 1, res = 0, i = 0;

        while(s < e){
            lmax = Math.max(lmax, height[s]);
            rmax = Math.max(rmax, height[e]);

            // res += Math.min(lmax, rmax) - height[i]; i++;
            if(lmax < rmax){
                res += lmax - height[s];
                s++;
            }else{
                res+= rmax - height[e];
                e--;
            }
            
            
        }

        return res;
    }
}