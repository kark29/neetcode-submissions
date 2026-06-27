class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> numList = new ArrayList<>();
		for (int i : nums) {
			if (!numList.contains(i)) {
				numList.add(i);
			} else {
				return true;
			}
		}
		return false;
    }
}