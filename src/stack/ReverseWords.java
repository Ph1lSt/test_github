package stack;

import java.util.LinkedList;

public class ReverseWords {

    public static String reverseString(String input) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
