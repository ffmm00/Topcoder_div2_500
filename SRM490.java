public class SRM490 {

	public double getExpectedTime(int N, int M) {
		return (N - gcd(N, M)) / 2.0;
	}

	long gcd(long a, long b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

}
