import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class findMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }

        System.out.println("Majority element of the given array:"+map.lastEntry().getKey());

    }
}
