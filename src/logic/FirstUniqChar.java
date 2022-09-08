package logic;

public class FirstUniqChar {

	public static void main(String[] args) {

		String s = "loveleetcode";
		
		
		System.out.println(firstUniqChar(s));

	}

	public static int firstUniqChar(String s) {
		int result = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int i = s.indexOf(c);
            if (i != -1 && i == s.lastIndexOf(c)) {
                result = Math.min(result, i);
            }
        }
        return result == s.length() ? -1 : result;
	}

}
