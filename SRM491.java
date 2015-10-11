public class SRM491 {

	public int theCount(int N, int K) {

		int c = 0;

		if (N >= 6) {
			for (int i = K; i <= N * 2 - 5; i++) {
				int num = 0;
				for (int j = 1; j <= N && j * 2 < i; j++) {
					int tmp = i - j;
					if (tmp >= 1 && tmp <= N)
						num++;
				}
				c += num * (num - 1) * (num - 2) / 3;
			}
		}

		return c;
	}

}
