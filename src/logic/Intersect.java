package logic;

public class Intersect {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2 };
		System.out.println(intersect(nums1, nums2));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] array = new int[nums1.length + nums2.length];
		int k=0;
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					array[k] = nums1[i];
					nums2[j] = -1;
					k++;
					j=nums2.length;
				}
			}
		}
		int[] result = new int[k];
		for(int i=0; i<result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
}
