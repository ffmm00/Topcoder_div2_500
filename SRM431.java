public class SRM431 {
	public double[] getHeights(int[] X, int R) {
		double[] y = new double[X.length];
		y[0] = 0;

		for (int i = 1; i < X.length; i++) {
			if (Math.abs(X[i] - X[i - 1]) > R)
				y[i] = 0;
			else
				y[i] = y[i - 1]
						+ Math.sqrt(R * R - (X[i] - X[i - 1])
								* (X[i] - X[i - 1]));
		}

		return y;

	}
}
