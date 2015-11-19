package algorithms;

public class IntegerToRoman {
    public static String intToRoman (int num) {
		StringBuilder sb = new StringBuilder();
		int digit = 1;
		int lastDigit;
		char tenDigit = 'X', fiveDigit = 'V', oneDigit = 'I';

		while (num != 0) {
			lastDigit = num % 10;
			num = num / 10;

			switch (digit) {
				case 2:
					tenDigit = 'C';
					fiveDigit = 'L';
					oneDigit = 'X';
					break;
				case 3:
					tenDigit = 'M';
					fiveDigit = 'D';
					oneDigit = 'C';
					break;
				case 4:
					oneDigit = 'M';
					break;
				default:
					break;
			}
			if (lastDigit < 5) {
				if (lastDigit == 4) {
					sb.insert(0, fiveDigit);
					sb.insert(0, oneDigit);
				} else {
					for (int i = 1; i <= lastDigit; i++)
						sb.insert(0, oneDigit);
				}
			} else {
				if (lastDigit == 9) {
					sb.insert(0, tenDigit);
					sb.insert(0, oneDigit);
				} else {
					for (int i = 1; i <= lastDigit - 5; i++)
						sb.insert(0, oneDigit);
					sb.insert(0, fiveDigit);
				}
			}
			digit++;
		}
		return sb.toString();
	}
}
