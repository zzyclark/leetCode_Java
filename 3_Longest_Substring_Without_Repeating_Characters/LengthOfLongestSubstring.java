import java.util.ArrayList;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
		int[] m = new int[127];
		char[] ch = s.toCharArray();
		int max = 0;
		int start = 0;
		for (int i = 0; i < m.length; i++) {
			m[i] = -1;
		}
		for (int i = 0; i < ch.length; i++) {
			if (m[ch[i]] < 0) {
				m[ch[i]] = i;
			} else {
				start = Math.max(start, m[ch[i]] + 1);
				m[ch[i]] = i;
			}
			max = Math.max(max, i - start + 1);
		}
		return max;
    }

    public static int alternateFunction(String s){
	int max = 0, j = 1;

	for (int i = 0; i < s.length(); ++i) {
	    if (i == j) 
		continue;
	    for (;j <= s.length(); ++j) {
		String sub = s.substring(i, j);
		if (sub.indexOf(s.charAt(j-1)) == sub.length() -1) {
		    max = max < sub.length() ? sub.length() : max;
		} else {
		    break;
		}
	    }
	}
	return max;
    }
}

