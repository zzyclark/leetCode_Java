import java.util.ArrayList;

public class ZigzagConversion {
    public static String convert (String s, int numRows) {
	if (0 == numRows)
	    return "";
	if (1 == numRows)
	    return s;

	char[] cs = s.toCharArray();
	int zigLength = (numRows - 1) * 2;
	StringBuilder builder = new StringBuilder(cs.length);

	for (int i = 0; i < numRows; ++i) {
	    for(int j = i; j < cs.length; j = j + zigLength) {
		builder.append(cs[j]);
		if( i != 0 && i != numRows - 1 && j + zigLength - i * 2 < cs.length) 
		    builder.append(cs[j + zigLength - i * 2]);
	    }
	}

	return builder.toString();
    }
}
