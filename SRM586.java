public class SRM586 {

	public int[] countSolutions(int[] Y, int[] query) {

		int n = Y.length;
		int m = query.length;
		int[] ans = new int[m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n - 1; j++) {
				int min = Math.min(Y[j], Y[j + 1]);
				int max = Math.max(Y[j], Y[j + 1]);
				if (query[i] >= min && query[i] <= max) {
					if (max == min) {
						ans[i] = -1;
						break;
					}
					if (j > 0 && query[i] == Y[j])
						continue;
					ans[i]++;
				}
			}
		}

		return ans;

	}

}
