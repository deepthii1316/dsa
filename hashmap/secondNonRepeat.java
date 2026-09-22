//Find second non-repeating element
package hashmap;
import java.io.*;
import java.util.*;

public class secondNonRepeat{
    static int calc(ArrayList<Integer>nums){
        var hmap = new LinkedHashMap<Integer,Integer>();
        int c =0;
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }

        for(int i:hmap.keySet()) 
            if(hmap.get(i)==1){
            c++;
            if(c==2) return i;
        }
        
        return -1;
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

        int ans = calc(nums);
        System.out.println(ans);
    }
}