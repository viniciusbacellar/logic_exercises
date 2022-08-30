package logic;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {2,14,18,22,22};
		
		System.out.println(containsDuplicate(nums));
		
	}

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
	}

}
