// Find elements appearing more than n/3 times
import java.io.*;
import java.util.*;

public class Nbythree{
    static void calculate(ArrayList<Integer>nums){
        var hmap = new HashMap<Integer, Integer>();
        int n = nums.size();
        for(int i:nums) hmap.put(i,hmap.getOrDefault(i,0)+1);
        for(int i:hmap.keySet()){
            if(hmap.get(i) > n/3) System.out.println(i + ", ");
        }
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

        calculate(nums);
        
    }
}