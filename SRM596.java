import java.util.Arrays;

public class SRM596 {

	public int getMin(String r) {

		int f = 1000000000;
		int[] array = new int[r.length()];
		Arrays.fill(array, f);
		array[0] = 0;

		for (int i = 0; i < array.length; i++) {
			char c = r.charAt(i);
			char n = ' ';
			switch (c) {
			case 'R':
				n = 'G';
				break;
			case 'G':
				n = 'B';
				break;
			default:
				n = 'R';
				break;
			}
			for (int j = i + 1; j < array.length; j++) {
				if (r.charAt(j) != n)
					continue;
				int d = (j - i) * (j - i);
				array[j] = Math.min(array[j], array[i] + d);
			}
		}

		return array[array.length - 1] == f ? -1 : array[array.length - 1];

	}
}