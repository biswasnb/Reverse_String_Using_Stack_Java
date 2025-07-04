import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello world";
        String output = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
    }
}
