class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int n = people.length, s = 0, e = n - 1, res = 0;
        Arrays.sort(people);
        while(s <= e){
            int sum = people[s] + people[e];
            if(sum <= limit){
                res++; 
                s++; 
                e--;
            }else{
                res++;
                e--;
            }
        }

        return res;
    }
}