package algorithms;

public class Atoi {
    public static int myAtoi(String str) {

        str = str.trim();
        if (str.equals(""))
            return 0;

        char[] cs = str.toCharArray();

        long result = 0;
        boolean sign = true;
        boolean starterCheck = false;
        int resultLength = 0;

        //first character check
        if (cs[0] == '-' || cs[0] == '+') {
            sign = cs[0] == '+';
            starterCheck = true;
        } else if (cs[0] >= '0' && cs[0] <= '9') {
            result = result * 10 + Character.getNumericValue(cs[0]);
            starterCheck = true;
        }

        int i = starterCheck ? 1 : 0;

        for (; i < cs.length; ++i) {

            if (resultLength > 10) {
                if (!sign)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }

            if (cs[i] >= '0' && cs[i] <= '9') {
                result = result * 10 + Character.getNumericValue(cs[i]);
                resultLength++;
            } else {
                break;
            }
        }

        if(sign && result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (!sign && -result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return sign ? (int)result : (int)-result;
    }
}
