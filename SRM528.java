import java.util.Arrays;

public class SRM528 {

	public int getMaximum(int[] eelLengths, int maxCuts) {

		Arrays.sort(eelLengths);
		int ans = 0;

		for (int a : eelLengths) {
			if (a % 10 == 0) {
				if (a <= maxCuts * 10 + 10) {
					maxCuts -= a / 10 - 1;
					ans += a / 10;
				} else {
					ans += maxCuts;
					maxCuts = 0;
				}
			}
		}

		for (int a : eelLengths) {
			if (a % 10 != 0) {
				int has = a / 10;
				int can = Math.min(has, maxCuts);
				maxCuts -= can;
				ans += can;
			}
		}

		return ans;
	}

}
