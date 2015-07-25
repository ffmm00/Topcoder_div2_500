
import java.util.Arrays;

public class SRM598 {

	public int minBins(int[] item) {

		Arrays.sort(item);

		int A = 0;
		int j = 0;

		for (int i = item.length - 1; i >= j; i--) {
			if (item[i] + item[j] <= 300) {
				j++;
			}
			A++;
		}

		return A;
	}

}
