import java.util.HashMap;
import java.util.LinkedList;

public class ValidParentheses {
    public static boolean isValid(String s) {

        if (s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;

        LinkedList<Character> charList = new LinkedList<Character>();
        HashMap<Character, Character> parenthesesMap = new HashMap<Character, Character>();
        parenthesesMap.put('(',')');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('{', '}');

        char firstChar = s.charAt(0);
        if (parenthesesMap.get(firstChar) == null)
            return false;   //if string start with a ] , ) , } or any other character

        charList.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (0 != charList.size() && parenthesesMap.get(charList.getLast()) == s.charAt(i)) {
                charList.removeLast();
            } else if(null != parenthesesMap.get(s.charAt(i))) {
                charList.add(s.charAt(i));
            } else {
                return false;
            }
        }

        if (charList.size() != 0)
            return false;

        return true;
    }
}
