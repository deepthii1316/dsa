// * Find element with maximum frequency (if tie → smallest)
import java.io.*;
import java.util.*;

public class maxFreq{
    static int calculate(ArrayList<Integer>nums){
        var hmap = new TreeMap<Integer, Integer>();
        int maxv = Integer.MIN_VALUE, ans = -1;
        for(int i:nums) hmap.put(i,hmap.getOrDefault(i,0)+1);
        for(var entry:hmap.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();

            if(maxv < v) {maxv = v; ans = k;}
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