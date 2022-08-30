package logic;

public class RotateArray {

	public static void main(String[] args) {

	}

	public static void rotate(int[] nums, int k) {
		int[] rotate = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			rotate[i] = nums[i];
		}
		for(int i=0; i<nums.length-1; i++) {
			nums[(i + k) % nums.length] = rotate[i];
		}
	}

}
