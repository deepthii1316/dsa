// Check if two arrays are anagrams (same frequency)
import java.io.*;
import java.util.*;

public class className{
    static bool calculate(ArrayList<Integer>nums1,ArrayList<Integer>nums2 ){
        if(n1 != n2) return false;
        var hmap1 = new HashMap<Integer, Integer>();
        var hmap2 = new HashMap<Integer, Integer>();

        for(int i:nums1) hmap1.put(i,hmap.getOrDefault(i,0)+1);
        return -1;
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