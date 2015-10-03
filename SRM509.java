public class SRM509 {

	public int getLuckyRemainder(String X) {

		int n = 1;

		for (int i = 0; i < X.length() - 1; i++) {
			n = (2 * n) % 9;
		}

		int sum = 0;

		for (int i = 0; i < X.length(); i++)
			sum += X.charAt(i) - '0';

		return (n * sum) % 9;
	}

}
