public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //if array length is 0, return empty
        if (strs.length == 0)
            return "";

        String firstStr = strs[0];
        int len = firstStr.length();

        for (int i = 0; i < len; ++i) {
            char c = firstStr.charAt(i);

            for (int j = 1; j < strs.length; ++j) {
                if (strs[j].length() <= i || strs[j].charAt(i) != c)
                    return firstStr.substring(0, i);
            }
        }
        return firstStr;
    }

    public static String alternateSolution(String[] strs) {
        //if array length is 0, return empty
        if (strs.length == 0)
            return "";

        int min = strs[0].length();
        int maxSame;
        String prefix = "";

        for (int i = 0; i < strs.length - 1; ++i) {
            maxSame = 0;
            min = min > strs[i + 1].length() ? strs[i + 1].length() : min;

            if (i == strs.length -2) {
                for (int j = 0; j < min; ++j) {
                    if (strs[i].charAt(j) == strs[i + 1].charAt(j))
                        prefix += strs[i].charAt(j);
                    else {
                        return prefix;
                    }
                }
                return prefix;
            }

            InnerLoop:
            for (int j = 0; j < min; ++j) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j))
                    maxSame++;
                else {
                    min = min > maxSame ? maxSame : min;
                    break InnerLoop;
                }
            }
        }

        return strs[0];
    }
}
