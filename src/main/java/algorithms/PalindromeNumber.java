package algorithms;

public class PalindromeNumber {
    public static boolean isPalindrome(int i) {
		if (i<0) return false;
		int input = i;
		int rev = 0;
		while (i > 0) {
			rev = rev * 10 + (i % 10);
			i /= 10;
		}
		if (rev == input)
			return true;
		else
			return false;
    }
}

