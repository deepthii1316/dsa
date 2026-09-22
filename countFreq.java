// Count frequency of each element
import java.io.*;
import java.util.*;

public class countFreq{
    static void calculate(ArrayList<Integer>nums){
        var hmap = new HashMap<Integer, Integer>();
        
        for(int i:nums) hmap.put(i,hmap.getOrDefault(i,0)+1);
        for(var entry:hmap.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();

            System.out.println("Key: " + k + ", " + "Value: " + v);
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