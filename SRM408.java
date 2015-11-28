import java.util.Arrays;

public class SRM408 {
	public static int numberOfNights(int[] candles) {

		int n = candles.length;
		int ans = 0;

		while (true) {
			if (ans + 1 > n)
				return ans;
			Arrays.sort(candles);
			for (int i = 0; i <= ans; i++) {
				if (candles[n - i - 1] == 0)
					return ans;
				else
					candles[n - i - 1]--;
			}
			ans++;
		}

	}

}
