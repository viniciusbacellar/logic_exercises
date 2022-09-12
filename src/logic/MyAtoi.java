package logic;

public class MyAtoi {

	public static void main(String[] args) {

		String x = "-233a72036854775808";
		myAtoi(x);

	}

	public static int myAtoi(String s) {
		if(s == null || s.isEmpty()) {
			return 0;
		}
		boolean isPositive = true;
		boolean primeiroChar = false;
		boolean sinalEncontrado = false;
		long resultInt = 0;
		for (char c : s.trim().toCharArray()) {
			if (!Character.isDigit(c)) {
				if (primeiroChar) {
					break;
				}
				if (c == '-') {
					if (sinalEncontrado) {
						return 0;
					}
					isPositive = false;
					primeiroChar = true;
					sinalEncontrado = true;
					continue;
				}
				if (c == '+') {
					if (sinalEncontrado) {
						return 0;
					}
					primeiroChar = true;
					sinalEncontrado = true;
					continue;
				}
				if (c == ' ') {
					if (!primeiroChar) {
						continue;
					}
				}
				return 0;
			}
			primeiroChar = true;
			int numChar = Character.getNumericValue(c);
			resultInt = resultInt * 10 + numChar;
			if (!isPositive && resultInt > Integer.MAX_VALUE) {
				return Integer.MIN_VALUE;
			}
			if (resultInt > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
		}
		if (!isPositive) {
			resultInt = resultInt * -1;
		}
		return (int) resultInt;
	}
}
