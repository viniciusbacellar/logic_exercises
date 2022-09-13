package logic;

public class StrStr {

	public static void main(String[] args) {

		String x = "sadbutsad";
		String z = "but";
		System.out.println(reverseKGroup(x, z));
		
		
	}

	public static int reverseKGroup(String haystack, String needle) {
		int left = 0, leng = needle.length();
		if(haystack.length() < needle.length()) {
			return -1;
		}
		while(leng < haystack.length()) {
			leng = left + needle.length();
			if(haystack.substring(left, leng).equals(needle)) {
				return left;
			}
			else {
				left++;
			}
		}
		return -1;
	}
}
