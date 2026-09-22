// Find least frequent element
import java.io.*;
import java.util.*;

public class LeastFreq{
    static int calculate(ArrayList<Integer>nums){
        var hmap = new HashMap<Integer, Integer>();
        int ans = Integer.MAX_VALUE;
        for(int i:nums) hmap.put(i,hmap.getOrDefault(i,0)+1);
        for(int i:hmap.keySet()){
            if(hmap.get(i) < ans) ans = hmap.get(i);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var nums = new ArrayList<Integer>();

        int n;
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            nums.add(num);
        }

        sc.close();

        int ans = calculate(nums);
        System.out.println(ans);
    }
}