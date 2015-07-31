public class SRM584 {

	public int maxDifference(String[] isFriend, int d) {

		int n = isFriend.length;

		final int infinity = 1000000000;
		boolean[][] g = new boolean[n][n];
		int[][] dist = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				g[i][j] = isFriend[i].charAt(j) == 'Y';
				dist[i][j] = g[i][j] ? 1 : infinity;
				if (i == j)
					dist[i][j] = 0;
			}

		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}

		int res = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				res = Math.max(res, dist[i][j]);
			}

		if (res >= infinity)
			return -1;

		return d * res;
	}

}
