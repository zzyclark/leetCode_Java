/**
 * @Author clark
 * @Date 16-Nov-2015
 */
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        Boolean positive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        long result = 0;
        long dividendAbs = Math.abs((long)dividend);
        long divisorAbs = Math.abs((long)divisor);

        if (divisorAbs > dividendAbs) {
            return 0;
        }

        while (dividendAbs >= divisorAbs) {
            long sum = divisorAbs;
            int count = 1;
            while (sum + sum < dividendAbs) {
                sum += sum;
                count += count;
            }

            dividendAbs -= sum;
            result += count;
        }

        result = positive ? result : -result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)result;
    }

    /**
     * Alternate solution use binary shift, same theory as first one.
     * @param dividend
     * @param divisor
     * @return
     */
    public static int divideAlternative(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        Boolean positive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        long result = 0;
        long dividendAbs = Math.abs((long)dividend);
        long divisorAbs = Math.abs((long)divisor);
        int bits = divideHelper(dividendAbs, divisorAbs);
        if (divisorAbs > dividendAbs) {
            return 0;
        }

        divisorAbs = divisorAbs << bits;
        while(bits >=0) {
            if (divisorAbs < dividendAbs) {
                result += 1L << bits;
                dividendAbs -= divisorAbs;
            } else if (divisorAbs == dividendAbs) {
                result += 1L << bits;
                break;
            }
            bits--;
            divisorAbs = divisorAbs >> 1;
        }

        result = positive ? result : -result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)result;
    }

    private static int divideHelper(long dividend, long divisor) {
        int bits = 0;
        while ((divisor << bits) < dividend) {
            bits ++;
        }
        return bits;
    }
}
