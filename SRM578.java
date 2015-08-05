public class SRM578 {

	private char[][] fie = null;
	private int dist;
	int n, m;

	public int count(String[] field, int dist) {
		n = field.length;
		m = field[0].length();
		fie = new char[n][m];
		this.dist = dist;

		for (int i = 0; i < n; i++) {
			fie[i] = field[i].toCharArray();
		}

		int sum = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				if (fie[i][j] == 'v') {
					sum++;
					dfs(i, j);
				}
			}

		return pm(sum) - 1;
	}

	private void dfs(int i, int j) {
		if (i < 0 || i >= n || j < 0 || j >= m)
			return;

		if (fie[i][j] != 'v')
			return;

		fie[i][j] = 'x';
		for (int k = -dist; k <= dist; k++) {
			for (int m = Math.abs(k) - dist; m <= dist - Math.abs(k); m++)
				dfs(i + k, j + m);
		}
	}

	private int pm(int n) {
		int r = 1;
		for (int i = 0; i < n; i++)
			r = (r * 2) % 1000000007;

		return r;
	}

}
