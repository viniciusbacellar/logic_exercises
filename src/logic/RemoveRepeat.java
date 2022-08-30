package logic;

public class RemoveRepeat {

	public static void main(String[] args) {

		int nums[] = { -1, -1, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicates(nums);
		for (int num : nums) {
			System.out.println(num);
		}

	}

	public static int removeDuplicates(int[] nums) {
		int k = nums.length;
		if (k == 0 || k == 1) {
			return k;
		}
		int j = 0;
		for (int i = 0; i < k - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[k - 1];
		return j;
	}

}
