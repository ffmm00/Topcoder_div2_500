public class SRM592 {

	int N, K;
	boolean[] used;
	long res;

	public long getNumber(int N, int K) {
		this.N = N;
		this.K = K;
		used = new boolean[N + 1];

		Try(1, 0);

		for (int i = 1; i <= N; i++)
			res *= i;

		return res;
	}

	private void Try(int x, int magic) {
		if (x > N) {
			if (magic >= K)
				res++;
		} else {
			for (int i = 1; i <= N; i++)
				if (!used[i]) {
					used[i] = true;
					Try(x + 1, magic + Math.max(x, i));
					used[i] = false;
				}
		}
	}

}
