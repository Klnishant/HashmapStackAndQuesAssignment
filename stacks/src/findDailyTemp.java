import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class findDailyTemp {
    public static int[] dailyTemp(int[] temperatures){
        int n = temperatures.length;
        int []nge = new int [n];
        for(int i=0;i<n;i++)nge[i] = 0;

        Stack<Integer> st = new Stack<>();

        // move from right to left
        for(int i = n-1; i>=0; --i){
            // pop until we find next greater element to the right
            // since we came from right stack will have element from right only
            // s.top() is the index of elements so we put that index inside temperatures vector to check
            while(!st.empty() && temperatures[st.peek()] <= temperatures[i])
                st.pop();

            // if stack not empty, then we have some next greater element,
            // so we take distance between next greater and current temperature
            // as we are storing indexes in the stack
            if(!st.empty())
                nge[i] = st.peek()-i; // distance between next greater and current

            // push the index of current temperature in the stack,
            // same as pushing current temperature in stack
            st.push(i);
        }
        return nge;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days:");
        int n = sc.nextInt();
        int[] temp=new int[n];
        System.out.println("Enter the temperature:");
        for (int i = 0; i < n; i++) {
            temp[i]= sc.nextInt();
        }
        System.out.println("The desired output is:"+ Arrays.toString(dailyTemp(temp)));
    }
}
