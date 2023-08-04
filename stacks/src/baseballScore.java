import java.util.Scanner;
import java.util.Stack;

public class baseballScore {
    public static int sumScore(String[] ops){
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ops.length; i++)
        {
            if(ops[i].equals("+"))
            {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int temp_sum = temp1 + temp2;
                sum += temp_sum;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(temp_sum);
            }
            else if(ops[i].equals("D"))
            {
                int temp = stack.pop();
                int temp_d = 2 * temp;
                sum += temp_d;
                stack.push(temp);
                stack.push(temp_d);
            }
            else if(ops[i].equals("C"))
            {
                int cancel = stack.pop();
                sum -= cancel;
            }
            else
            {
                int temp = Integer.parseInt(ops[i]);
                sum += temp;
                stack.push(temp);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of the score:");
        int n = sc.nextInt();

        String[] str = new String[n];
        System.out.println("Enter the score:");
        for (int i = 0; i < n; i++) {
            str[i]= sc.next();
        }
        System.out.println("Sum of the total score:"+sumScore(str));
    }
}
