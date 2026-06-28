class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
		int diff = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			diff = target - nums[i];

			if (!map.containsKey(diff)) {
				map.put(nums[i], i);
			} else {

				if (map.get(diff) < i) {

					res[0] = map.get(diff);
					res[1] = i;
				} else {
					res[0] = i;
					res[1] = map.get(diff);

				}
				return res;
			}
		}

		return res; 
    }
}
