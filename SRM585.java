public class SRM585 {

	public long theMinCars(int treeHeight) {

		long A = 1;

		for (int i = 1; i < treeHeight; i++) {
			if (i % 2 == 0)
				A = A * 2 - 1;
			else
				A = A * 2 + 1;
		}

		return A;
	}

}
