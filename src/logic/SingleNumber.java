package logic;

public class SingleNumber {

	public static void main(String[] args) {

		int[] nums = { -80, 48, 777, 423, -477, -435, 349, -988, -379, -197, 192, 13, -496, -787, 94, 329, -490, -230,
				-929, 457, 591, 75, -80, 48, 777, 423, -435, 349, -988, -379, -197, 192, 13, -496, -787, 94, 329, -490,
				-230, -929, 457, 591, 75 };

		System.out.println("\n" + singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int result = 0;
		// even occurence will nullify
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
			System.out.println(result);
		}
		return result;

	}

}
