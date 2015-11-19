package algorithms;

public class ReverseInteger {
    public static int reverse(int x) {
	int r = 0;

	while(x != 0) {
	    if((long)r * 10 > Integer.MAX_VALUE || (long)r * 10 < Integer.MIN_VALUE)
		return 0;
	    r = r * 10;
	    r = r + x % 10;
	    x = x/10;
	}

	return r;
    }
}
