public class SRM427 {
	public int shortestPeriod(int day, int year) {
		return day / gcd(day, year);
	}

	int gcd(int a, int b) {
		while (b != 0) {
			int t = a;
			a = b;
			b = t % b;
		}
		return a;
	}
}
