import java.util.Arrays;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
	if ( s == null || s.length() ==0) 
	    return "";

	char[] s2 = addBoundaries(s.toCharArray());
	int[] p = new int[s2.length*2];
	int c = 0, r = 0; //c is the center, and r the right most boundry of the current center
	int m = 0, n = 0; //m and n is used to test whether left side of the center is equal to the right side
	for(int i = 1; i<s2.length; ++i) {
	    if(i > r) {
		p[i] = 0;
		m = i - 1;
		n = i + 1;
	    } else {
		int i2 = c*2 - i;
		if (p[i2] < r - i) {
		    p[i] = p[i2];
		    m = -1; //this means right side new palindromic is not exceed right most boundry, move to next counter to start next one;
		} else {
		    p[i] = r - i;
		    n = r+1; 
		    m = i*2 -n;
		}
	    }
	    while (m>=0 && n < s2.length && s2[m] == s2[n]) {
		p[i]++;
		m--;
		n++;
	    }

	    if (i + p[i] > r) {
		c = i;
		r = i + p[i];
	    }
	}

	int len = 0; c = 0;
	for (int i = 0; i < s2.length; ++i) {
	    if (len < p[i]) {
		len = p[i];
		c = i;
	    }
	}

	char[] s3 = Arrays.copyOfRange(s2, c-len, c+len+1);
	return String.valueOf(removeBoundaries(s3));
    }

    private static char[] addBoundaries(char[] cs) {
	if (cs == null || cs.length == 0) 
	    return "||".toCharArray();
	char[] cs2 = new char[cs.length*2 + 1];
	for (int i = 0; i < (cs2.length - 1); i = i + 2) {
	    cs2[i] = '|';
	    cs2[i+1] = cs[i/2];
	}
	cs2[cs2.length - 1] = '|';
	return cs2;
    }

    private static char[] removeBoundaries(char[] cs) {
	if (cs == null || cs.length == 0) 
	    return "".toCharArray();
	char[] cs2 = new char[(cs.length -1 )/2];
	for (int i = 0; i < cs2.length; i++) {
	    cs2[i] = cs[i*2+1];
	}
	return cs2;
    }
}
 
