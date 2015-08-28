public class SRM566 {

	public int minMoves(String[] tiles) {

		int c = 0;

		int n = tiles.length;
		int l = tiles[0].length();

		int x = 0, y = 0;

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < l; k++) {
				if (tiles[i].charAt(k) == '.') {
					x = i;
					y = k;
				}
			}
		}

		if (x == n - 1 && y == l - 1)
			return 0;

		if (x == n - 1 || y == l - 1)
			return 1;

		return 2;
	}

}
