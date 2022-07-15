package firstWeek;

public class Practice3 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		System.out.println(deleteElement(nums, val));
		for (int i : nums) {
			System.out.println(i);
		}
	}

	/**
	 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2

		输出：5, nums = [0,1,4,0,3]
	 */
	static int deleteElement(int[] nums, int val) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
		
	}

}
