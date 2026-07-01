class Solution {
    public boolean isPalindrome(String s) {
        if (s == null)
			return false;

		String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int n = cleanStr.length() / 2;
		for (int i = 0; i < n; i++) {

			if (cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length() - i - 1)) {
				return false;
			}
		}

		return true;
    }
}
