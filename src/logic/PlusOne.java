package logic;

public class PlusOne {

	public static void main(String[] args) {

		int[] digits = { 8,9,9,9 };
		plusOne(digits);
	}

	public static int[] plusOne(int[] digits) {
		int k = digits.length - 1;
		if (digits[k] != 9) {
			digits[k] += 1;
			return digits;
		} else {
			for (int j = k; j >= 0; j--) {
				if (digits[j] == 9) {
					digits[j] = 0;
					if (digits[j] == 0 && j == 0) {
						int[] result = new int[digits.length+1];
						result[0] = 1;
						for(int i=1; i<result.length; i++) {
							result[i] = digits[i-1];
						}
						return result;
					}
				}
				else {
					digits[j] += 1;
					return digits;
				}
			}
		}
		return null;
	}
}
