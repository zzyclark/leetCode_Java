import java.util.List;
import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {

    private static char[][] charMatrix = new char[][]{{' '}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static List<String> letterCombinations(String digits) {
        char[] inputArray = digits.toCharArray();
        List<String> result = new ArrayList<String>();

        for (int i = inputArray.length - 1; i > -1; i--)
            result = updateList(result, charMatrix[Character.getNumericValue(inputArray[i])]);
        return result;
    }

    private static List<String> updateList(List<String> oldList, char[] charArray) {
        if (charArray.length == 0)
            return oldList;
        List<String> newList = new ArrayList<String>();
        if (oldList.size() == 0) {
            for (int i = 0; i < charArray.length; i++)
                newList.add(Character.toString(charArray[i]));
        } else {
            for (int i = 0; i < charArray.length; i++) {
                for (String data : oldList) {
                    newList.add(Character.toString(charArray[i]) + data);
                }
            }
        }

        return newList;
    }
}
