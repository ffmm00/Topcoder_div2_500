public class SRM449 {

	public long findSum(int N) {

		long ans = 0, n;

		while (N > 0) {
			n = (N + 1) / 2;
			ans += n * n;
			N /= 2;
		}

		return ans;
	}

}
