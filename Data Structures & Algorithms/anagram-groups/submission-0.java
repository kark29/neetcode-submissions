class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] chA = str.toCharArray();

			Arrays.sort(chA);

			String sortedS = new String(chA);
			map.putIfAbsent(sortedS, new ArrayList<>());
			map.get(sortedS).add(str);

		}
		res = new ArrayList<>(map.values());

		return res;
    }
}
