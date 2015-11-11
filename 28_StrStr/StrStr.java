/**
 * @Author clark
 * @Date 11-Nov-2015
 */
public class StrStr {
    public static int strStr(String haystack, String needle) {
        Integer strIndex = -1;
        char needleCharArray[] = needle.toCharArray();
        Integer needleLength = needleCharArray.length;

        char haystackCharArray[] = haystack.toCharArray();
        Integer haystackLength = haystackCharArray.length;

        if (needleLength > haystackLength) {
            return -1;
        }

        Integer oldStart = 0;
        Integer newStart = 0;
        OuterLoop:
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            InnerLoop:
            for (int j = 0; j < needleLength; j++) {
                if (haystackCharArray[i] == needleCharArray[0]) {
                    if (newStart == oldStart) {
                        newStart = i;
                    }
                }
                if (haystackCharArray[i] == needleCharArray[j]) {
                    i++;
                    continue InnerLoop;
                } else {
                    if (newStart > oldStart) {
                        oldStart = newStart;
                        i = newStart - 1;
                    }
                    continue OuterLoop;
                }
            }
            strIndex = i - needleLength;
            break;
        }

        return strIndex;
    }

    /**
     * KMP approach
     * @param haystack
     * @param needle
     * @return
     */
    public static int kmp(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        Integer needleLength = needle.length();
        Integer haystackLength = haystack.length();
        Integer needleIndex = 0;
        Integer haystackIndex = 0;

        int[] keyTable = constructKeyTable(needle);

        while (haystackIndex + needleIndex < haystackLength) {
            if (needle.charAt(needleIndex) == haystack.charAt(haystackIndex + needleIndex)) {
                if (needleIndex == needleLength -1) {
                    return haystackIndex;
                }
                needleIndex++;
            } else {
                if (keyTable[needleIndex] > -1) {
                    haystackIndex = haystackIndex + needleIndex - keyTable[needleIndex];
                    needleIndex = keyTable[needleIndex];
                } else {
                    needleIndex = 0;
                    haystackIndex++;
                }
            }
        }

        return -1;
    }

    private static int[] constructKeyTable(String needle) {
        Integer length = needle.length();
        Integer pos = 2, cnd = 0;
        int[] keyTable = new int[length];
        keyTable[0] = -1;

        while (pos < length) {
            if (needle.charAt(pos - 1) == needle.charAt(cnd)) {
                cnd++;
                keyTable[pos] = cnd;
                pos++;
            } else if (cnd > 0) {
                cnd = keyTable[cnd];
            } else {
                keyTable[pos] = 0;
                pos++;
            }
        }

        return keyTable;
    }
}
