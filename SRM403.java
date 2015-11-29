public class SRM403 {

	public static int count(int a, int b) {
		return rep(b, a, 0);
	}

	static int rep(int x, int z, long y) {
		int r = 0;

		if ((long) y * 10 + 4 <= x) {
			if (z <= y * 10 + 4)
				r++;
			r += rep(x, z, y * 10 + 4);
		}

		if ((long) y * 10 + 7 <= x) {
			if (z <= y * 10 + 7)
				r++;
			r += rep(x, z, y * 10 + 7);
		}

		return r;

	}

}
