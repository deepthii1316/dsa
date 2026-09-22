//find element whose value is same as its frequency
import java.io.*;
import java.util.*;

public class frequencyValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer>hmap = new HashMap<>();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            hmap.put(val,hmap.getOrDefault(val,0)+1);
        }

        for(int i:hmap.keySet()) if(i == hmap.get(i)) System.out.print(i + " ");
        sc.close();
        }
    }
