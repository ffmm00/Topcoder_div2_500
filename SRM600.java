

public class SRM600 {

	public int getMinimum(int[] numbers, int goal) {

		int res = Integer.MAX_VALUE;

		for (int i = 0; i < 32; i++) {
			if ((goal >> i & 1) == 0)
				continue;
			int current = 0;

			for (int j : numbers) {
				if ((j >> i & 1) == 1 && ((j | goal) == goal)) {
					current++;
				}
			}
			res = Math.min(res, current);
		}

		return res;
	}

}
