// Check if two arrays are anagrams (same frequency)
package hashmap;
import java.io.*;
import java.util.*;

public class AnagramCheck{
    static boolean calculate(ArrayList<Integer>nums1,ArrayList<Integer>nums2 ){
        if(nums1.size() != nums2.size()) return false;
        var hmap = new HashMap<Integer, Integer>();

        for(int i:nums1) hmap.put(i,hmap.getOrDefault(i,0)+1);

        for(int i:nums2){
            int c = hmap.getOrDefault(i,0);
            if(c==0) return false;
            hmap.put(i, c-1);
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var nums1 = new ArrayList<Integer>();
        var nums2 = new ArrayList<Integer>();

        int n1,n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for(int i=0;i<n1;i++){
            int num = sc.nextInt();
            nums1.add(num);
        }

        for(int i=0;i<n2;i++){
            int num = sc.nextInt();
            nums2.add(num);
        }

        sc.close();

        if(calculate(nums1,nums2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}