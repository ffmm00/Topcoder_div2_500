import java.util.Arrays;

public class SRM577 {

	public double getProbability(String[] ratings) {

		StringBuilder sb = new StringBuilder();

		for (String s : ratings)
			sb.append(s);

		String[] rat = sb.toString().split(" ");
		int elly = Integer.valueOf(rat[0]);
		int n = rat.length;
		int r = n / 20;

		if (n % 20 != 0)
			r++;

		if (r == 1)
			return 1.0;
		else {
			int[] all_rating = new int[n];
			for (int i = 0; i < n; i++) {
				all_rating[i] = Integer.valueOf(rat[i]);
			}
			Arrays.sort(all_rating);

			int pos = Arrays.binarySearch(all_rating, elly);
			if (pos == n - 1)
				return 1.0;
			else if (pos >= n - r)
				return 0.0;
			else
				return 1.0 / r;
		}
	}

}
