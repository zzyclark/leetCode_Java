package algorithms;

import java.util.Stack;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Integer unMatchedRightBrace = -1;
        Integer max = 0;
        Stack<Integer> braceStack = new Stack<Integer>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                braceStack.push(i);
            } else {
                if (braceStack.isEmpty()) {
                    unMatchedRightBrace = i;
                } else {
                    braceStack.pop();
                    if (braceStack.isEmpty()) {
                        max = Math.max(max, i - unMatchedRightBrace);
                    } else {
                        max = Math.max(max, i - braceStack.peek());
                    }
                }
            }
        }

        return max;
    }
}
