public class SRM574 {

	int z, zn, x, xn;

	public int minimumMoves(int A, int B) {

		int AR = reverse(A);
		if (check(A, B)) {
			return (keta(A) > zn + xn ? (B == reverse(B) ? 1 : 2) : 0)
					+ keta(A) - keta(B);
		} else if (check(AR, B)) {
			return 1 + keta(A) - keta(B);
		}

		return -1;
	}

	public int reverse(int a) {

		int res = 0;

		while (a >= 0) {
			res += a % 10;
			a /= 10;
			if (a == 0)
				break;
			res *= 10;
		}
		return res;

	}

	public int keta(int a) {
		int b = Integer.toString(a).length();
		return b;
	}

	boolean check(int A, int B) {
		z = 1;
		zn = 0;
		while (B % z != B) {
			z *= 10;
			zn++;
		}

		x = 1;
		xn = 0;
		while (A / x > 0) {
			if ((A / x) % z == B)
				return true;
			x *= 10;
			xn++;
		}

		return false;

	}

}
