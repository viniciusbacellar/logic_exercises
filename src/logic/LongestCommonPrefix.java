package logic;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] s = { "dog", "racecar", "car" };
		longestCommonPrefix(s);

	}

	public static String longestCommonPrefix(String[] strs) {
		int left = 0, right = strs[0].length(), iString = 1;
		String result = strs[0];
		if (strs.length == 1)
			return result;
		while (right >= 0) {
			if (strs[iString].isEmpty())
				return "";

			if (strs[iString].indexOf(result.substring(left, right)) == 0) {
				if (iString == strs.length - 1) {
					return result.substring(left, right);
				} else {
					iString++;
					continue;
				}
			} else {
				right--;
			}
			if (iString == strs.length - 1) {
				iString = 1;
			}
		}
		return result;
	}

}
