import java.util.Scanner;
import java.util.TreeMap;

public class sortByValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String,Integer> map = new TreeMap<>();

        System.out.println("Enter the size of the list you want to create:");
        int n = sc.nextInt();

        System.out.println("Enter the key and value of the map");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(value,key);
        }
        System.out.println(map);
    }
}
