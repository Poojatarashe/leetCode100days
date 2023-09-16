import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 11, 15, 6, 8 };
		int target = 14;

		int[] result = twoSum(arr, target);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				result[0] = i;
				result[1] = map.get(nums[i]);
			} else {
				map.put(target - nums[i], i);
			}
		}
		return result;
	};
}
