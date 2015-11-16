import java.util.*;

/**
 * @Author clark
 * @Date 16-Nov-2015
 */
public class FindSubString {
    private static Map<Integer, String> substringCache;

    public static List<Integer> findSubstring(String s, String[] words) {
        int wordLength = words[0].length();
        int stringLength = s.length();
        Map<String, Integer> keyMap = constructKeyMap(words);
        Map<String, Integer> testMap = new HashMap<String, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        constructSubstringCache(s, wordLength);

        OuterLoop:
        for (int i = 0; i < wordLength; ++i) {
            testMap.clear();
            int startPos = i;
            int wordCount = 0;

            while(startPos < stringLength - wordLength + 1) {
                String subStr = substringCache.get(startPos);
                if (keyMap.containsKey(subStr)) {
                    if (testMap.containsKey(subStr)) {
                        int currentOccurrence = testMap.get(subStr);
                        //words in subString must occur exactly once
                        if (currentOccurrence + 1 > keyMap.get(subStr)) {
                            //find last occur of this string, start again from there, and no need to clear map, only minus or remove the occurrence before that word
                            int removeStartPos = startPos - wordCount * wordLength;
                            InnerLoop:
                            while(true) {
                                String oldWordCheck = substringCache.get(removeStartPos);

                                if (testMap.get(oldWordCheck) > 1) {
                                    testMap.put(oldWordCheck, testMap.get(oldWordCheck) - 1);
                                } else {
                                    testMap.remove(oldWordCheck);
                                }
                                removeStartPos += wordLength;
                                wordCount--;

                                if (subStr.equals(oldWordCheck)) {
                                    break InnerLoop;
                                }
                            }
                        } else {
                            testMap.put(subStr, currentOccurrence + 1);
                            wordCount++;
                            startPos += wordLength;
                        }
                    } else {
                        testMap.put(subStr, 1);
                        wordCount++;
                        startPos += wordLength;
                    }

                    if (wordCount == words.length) {
                        wordCount = 0;
                        testMap.clear();
                        result.add(startPos - wordLength*words.length);
                        startPos = startPos - wordLength*(words.length-1);
                    }
                } else {
                    testMap.clear();
                    wordCount = 0;
                    startPos+=wordLength;
                }
            }
        }

        return result;
    }

    private static Map<String, Integer> constructKeyMap(String[] words) {
        Map<String, Integer> keyMap = new HashMap<String, Integer>();

        for (String word : words) {
            if (keyMap.containsKey(word)) {
                keyMap.put(word, keyMap.get(word)+1);
            } else {
                keyMap.put(word, 1);
            }
        }

        return keyMap;
    }

    private static void constructSubstringCache(String s, Integer wordLength) {
        int stringLength = s.length();
        substringCache = new HashMap<Integer, String>();
        for (int i = 0; i < stringLength - wordLength + 1; ++i) {
            substringCache.put(i, s.substring(i , i + wordLength));
        }
    }

    public static void main(String[] args) {
        List<Integer> test = findSubstring("barfoofoobarthefoobarman"
                , new String[] {"bar", "foo", "the"});
        for (Integer i : test) {
            System.out.print(i);
        }
    }
}
