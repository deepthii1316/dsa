class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>();
        Arrays.sort(nums);
        
        int y = 0;
        
        for(int i = 0; i < nums.length; i++){
        var hmap = new HashMap<Integer,Integer>();

            int search = -nums[i];
            for(int j = i+1; j < nums.length; j++){
                
                
                    y = nums[j];
                    int f = search - y;
                   
                        if(hmap.containsKey(f)) {
                            res.add(new ArrayList<> (Arrays.asList(nums[i], y, f))); 
                        }

                    hmap.put(nums[j],j);                  
            }
        }

        return new ArrayList<>(res);
    }
}