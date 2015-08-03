public class SRM580 {

	public int getmax(int[] l, int[] t) {

		int n = l.length;
		long[] points = new long[2 * n];
		for (int i = 0; i < n; i++) {
			points[2 * i] = -t[i] - l[i];
			points[2 * i + 1] = -t[i];
		}

		int res = 0;

		for (int i = 0; i < 2 * n; i++)
			for (int j = i + 1; j < 2 * n; j++) {
				int count = 0;
				for (int k = 0; k < n; k++) {
					if ((-t[k] - l[k] <= points[i] && -t[k] >= points[i])
							|| (-t[k] - l[k] <= points[j] && -t[k] >= points[j]))
						count++;
				}
				res = Math.max(res, count);
			}

		return res;
	}

}
