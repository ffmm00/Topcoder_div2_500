public class SRM575 {

	public String find(int n) {

		boolean[] win = new boolean[n + 1];

		for (int i = 0; i <= n; i++)
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && !win[i - j])
					win[i] = true;
			}

		return win[n] ? "John" : "Brus";
	}

}
