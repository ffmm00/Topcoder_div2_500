public class SRM535 {

	public long get(long G, long L) {

		long temp = L / G;
		long ans = Long.MAX_VALUE;

		if (L % G != 0)
			return -1;

		for (long i = 1; i <= temp / i; i++)
			if (temp % i == 0) {
				long a = temp / i;
				if (gcd(i, a) == 1)
					ans = Math.min((i + a) * G, ans);
			}
		if (ans == Long.MAX_VALUE)
			return -1;

		return ans;
	}

	public long gcd(long a, long b) {
		return a == 0 ? b : gcd(b % a, a);
	}

}
