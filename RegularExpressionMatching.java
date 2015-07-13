public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
		//special case 1, p length is 0
		if (p.length() == 0)
			return s.length() == 0;

		//special case 2, p length is 1
		if (p.length() == 1) {
			if(s.length() < 1)
				return false;
			else if (p.charAt(0) != s.charAt(0) && p.charAt(0) != '.')
				return false;
			else
				return isMatch(s.substring(1), p.substring(1));
		}

		//case 1: when the second char of p is not *
		if (p.charAt(1) != '*') {
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
}
