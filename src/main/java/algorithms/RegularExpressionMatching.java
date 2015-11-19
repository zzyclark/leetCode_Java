package algorithms;

public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
		//special case 1, p length is 0
		if (p.length() == 0)
			return s.length() == 0;

		//special case 2, p length is 1
		// and case 1: when the second char of p is not *
		if ((p.length() > 1 && p.charAt(1) != '*') || p.length() == 1) {
			if (s.length() < 1)
				return false;
			else if (p.charAt(0) != s.charAt(0) && p.charAt(0) != '.')
				return false;
			else
				return isMatch(s.substring(1), p.substring(1));
		}

		//case 2: when the second char of p is *
		else
		{
			//case 2.1: * can represent 0 element
			if (isMatch(s, p.substring(2)))
				return true;

			//case 2.2: * can represent 1 or more element
			int i = 0;
			while (i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')) {
				if (isMatch(s.substring(i + 1), p.substring(2))) {
					return true;
				}
				i++;
			}
			return false;
		}
	}

	public static boolean dpSolution2D(String s, String p) {
		/**
		 * recursive function for 2D array
		 * match[i][j] means s[0:i-1], p[0:j-1] is match or not
		 * match[i][j] = match[i-1][j-1] && (s[i-1] == p [j-1] || p[j-1] == '.')
		 */

		/**
		 * step 1: construct base match array
		 */
		boolean match[][] = new boolean[s.length()+1][p.length()+1];
		match[0][0] = true;

		//since * can means 0 element, which means if * locate at position 2, the first element can be erased

		for (int j = 2; j <= p.length(); j+=2) {
			if (p.charAt(j-1) == '*')
				match[0][j] = match[0][j-2];
		}

		/**
		 * step 2: start dynamic process
		 */

		for (int i = 1; i < s.length() + 1; i++) {
			for (int j = 1; j < p.length() + 1; j++) {
				//case 1: if element is not *, do normal match
				if (p.charAt(j-1) != '*')
					match[i][j] = match[i-1][j-1] && (p.charAt(j-1) == '.' || p.charAt(j-1) == s.charAt(i-1));
				//case 2: if element is *, 3 different condition
				else
					match[i][j] = match[i][j-2] /* if * means 0 elements */
							|| match[i][j-1] /* if * means 1 element */
							|| (match[i-1][j] && (p.charAt(j-2) == s.charAt(i-1) || p.charAt(j-2) =='.')); /* if * means more than 1 element */
			}
		}

		return match[s.length()][p.length()];
	}
}
