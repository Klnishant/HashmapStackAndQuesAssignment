import java.util.Scanner;
import java.util.Stack;

public class stringDecoder {
    public  static String decoder(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()){
            if (ch !=']'){
                stack.push(ch);
            }
            else {
                StringBuilder sb = new StringBuilder();
                while (stack.peek()!='['){
                    sb.append(stack.pop());
                }
                //removing '[' in stacks
                stack.pop();
                int k=0;
                int base=1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = (stack.pop() - '0') * base + k;
                    base*=10;
                }
                while (k-- >0){
                    for (int i = sb.length()-1; i >=0 ; i--) {
                        stack.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] result = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the encoded string:");
        String str = sc.next();
        System.out.println("Decoded string is:"+decoder(str));
    }
}
