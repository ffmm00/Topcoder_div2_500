public class SRM579 {

	public int minPresses(String[] lines) {
		int ans = lines[0].length() + 1;

		for (int i = 1; i < lines.length; i++) {
			int minCost = Integer.MAX_VALUE;

			for (int j = 0; j < i; j++) {
				int lcp = longCommon(lines[i], lines[j]);
				if ((j == i - 1) && (lcp == lines[i - 1].length())) {
					int m = lines[i].length() - lines[i - 1].length();
					minCost = Math.min(minCost, m);
				} else {
					int m = lines[i].length() - lcp + 2;
					minCost = Math.min(minCost, m);
				}
			}
			
			if(minCost != Integer.MAX_VALUE)
			ans += minCost + 1;

		}

		return ans;
	}

	int longCommon(String a, String b) {
		int ans = 0;

		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				ans++;
			} else
				break;
		}

		return ans;
	}

}
