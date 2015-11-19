package algorithms;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    //recursive solution
    public static List<String> generateParenthesis (int n) {
        List<String> result = new ArrayList<String>();
        if (0 >= n) return result;
        helper(result, "", n, n);
        return result;
    }

    private static void helper(List<String> result, String val, int left, int right) {
        if (0 < left)
            helper(result, val+"(", left - 1, right);
        if (0 < right && right > left)
            helper(result, val+")", left, right - 1);
        if (0 == left && 0 == right) {
            result.add(val);
            return;
        }
    }
}
