public class SRM444 {

	public int getLevel(long N) {

		int num = 0;

		for (long x = 2; x * x <= N; x++) {
			if (N % x == 0) {
				while (N % x == 0) {
					num++;
					N /= x;
				}
			}
		}

		if (N != 1)
			num++;

		int ans = 0;

		while (num > (Math.pow(4.0, ans + 1)) - 0.5){
			ans++;
		}

			return ans;
	}

}
