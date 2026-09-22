//find first non repeating element
import java.io.*;
import java.util.*;

public class firstNonRepeat{
    static int nonRepeat(ArrayList<Integer> nums){
        LinkedHashMap <Integer, Integer> hmap = new LinkedHashMap<>();
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        for(int i:hmap.keySet()) if(hmap.get(i)==1) return i;

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

        int ans = nonRepeat(nums);
        System.out.println(ans);
    }
}