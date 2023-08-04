import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class sortByKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,String> map = new TreeMap<>();

        System.out.println("Enter the size of the list you want to create:");
        int n = sc.nextInt();

        System.out.println("Enter the key and value of the map");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(key,value);
        }
        System.out.println(map);
    }
}
