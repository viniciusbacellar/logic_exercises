package logic;

public class ReverseString {

	public static void main(String[] args) {

	}

	public void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while (left < s.length / 2) {
			char aux = s[left];
			s[left] = s[right];
			s[right] = aux;
			left++;
			right--;
		}

	}

}
