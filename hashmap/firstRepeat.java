// find first repeating element
package hashmap;
import java.io.*;
import java.util.*;

public class firstRepeat{
    static int findFirstRepeat(ArrayList<Integer>nums){
        // LinkedHashMap<Integer,Integer>hmap = new LinkedHashMap<>();
        // for(int i:nums){
        //     hmap.put(i,hmap.getOrDefault(i,0)+1);
        // }

        // for(int i:hmap.keySet()) if(hmap.get(i)>1) return i;

        HashSet<Integer>hs = new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)) return i;
            hs.add(i);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>nums = new ArrayList<>();

        int n;
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            nums.add(num);
        }

        int ans = findFirstRepeat(nums);
        System.out.println(ans);
        sc.close();
    }
}