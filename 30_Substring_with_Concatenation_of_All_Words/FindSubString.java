import java.util.*;

/**
 * @Author clark
 * @Date 16-Nov-2015
 */
public class FindSubString {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        int wordLength = words[0].length();
        int stringLength = s.length();

        if (words.length == 0) {
            return result;
        }

        //This check must have, otherwise one of the test case will throw TLE
        if (words.length * wordLength > stringLength) {
            return result;
        }

        String[] subStringArray = new String[stringLength - wordLength + 1];
        Map<String, Integer> keyMap = new HashMap<String, Integer>();
        Map<String, Integer> testMap = new HashMap<String, Integer>();

        //construct key map
        for (String word : words) {
            keyMap.put(word, keyMap.getOrDefault(word, 0) + 1);
        }

        //construct sub string array
        for (int i = 0 ; i < subStringArray.length; ++i) {
            String subStr = s.substring(i, i + wordLength);
            subStringArray[i] = keyMap.containsKey(subStr) ? subStr : "";
        }

        for (int i = 0; i < wordLength; ++i) {
            int count = 0;
            int startPos = i;
            testMap.clear();
            for (int j = i; j < stringLength - wordLength + 1; j += wordLength) {
                String subStr = subStringArray[j];
                if (subStr.equals("")) {
                    testMap.clear();
                    count = 0;
                    startPos = j + wordLength;
                    continue;
                } else {
                    testMap.put(subStr, testMap.getOrDefault(subStr, 0) + 1);
                    count++;
                }

                //add new word, check over counting
                if (testMap.get(subStr) > keyMap.get(subStr)) {
                    while(true) {
                        String removeCandidate = subStringArray[startPos];
                        testMap.put(removeCandidate, testMap.get(removeCandidate) - 1);
                        startPos += wordLength;
                        count--;

                        if (removeCandidate.equals(subStr)) {
                            break;
                        }
                    }
                }

                //if count equal to the total word number of the words length, add the start pos to result
                if (count == words.length) {
                    result.add(startPos);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> test = findSubstring("aaaaaaaa"
                , new String[] {"aa", "aa", "aa"});
        for (Integer i : test) {
            System.out.print(i);
        }
    }
}
