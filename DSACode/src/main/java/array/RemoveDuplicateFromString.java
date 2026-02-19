package array;

import java.util.Stack;

public class RemoveDuplicateFromString {

    /**
     * a -> push
     * b -> push
     * b same as top -> pop
     * a same as top -> pop
     * c -> push
     * a -> push
     */
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder newString = new StringBuilder();
        for (char c : st) {
            newString.append(c);
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateFromString rdfs = new RemoveDuplicateFromString();
        String newString = rdfs.removeDuplicates("abbaca");

        System.out.println(newString);
    }
}
