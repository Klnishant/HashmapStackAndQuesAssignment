import java.util.HashMap;
import java.util.Scanner;

public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();

        int ans=0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                System.out.println("Yes");
                ans=1;
                break;
            }
            map.put(arr[i],1);
        }
        if (ans==0){
            System.out.println("No");
        }
    }
}
