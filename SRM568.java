public class SRM568 {

	public int minOperations(int[] red, int[] green, int[] blue) {

		int n = red.length;
		if (n < 3)
			return -1;

		int min = Integer.MAX_VALUE;

		for (int r = 0; r < n; ++r)
			for (int g = 0; g < n; ++g)
				for (int b = 0; b < n; ++b) {
					if (r == g || r == b || b == g)
						continue;

					int count = 0;

					for (int i = 0; i < n; ++i) {
						if (r != i)
							count += red[i];
						if (b != i)
							count += blue[i];
						if (g != i)
							count += green[i];
						if (r != i && b != i && g != i)
							count -= Math.max(Math.max(red[i], green[i]),
									blue[i]);
					}
					min = min < count ? min : count;
				}

		return min;
	}

}
