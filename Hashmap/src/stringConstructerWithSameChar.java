import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringConstructerWithSameChar {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> magazineLetters = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineLetters.put(c, magazineLetters.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineLetters.containsKey(c) || magazineLetters.get(c) <= 0) {
                return false;
            }
            magazineLetters.put(c, magazineLetters.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the RansomNote String: ");

        String s=sc.nextLine();

        System.out.print("Enter the Magazine String: ");

        String r=sc.nextLine();

        System.out.println(canConstruct(s,r));
    }
}
