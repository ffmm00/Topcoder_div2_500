public class SRM515 {

	public String getEarliest(int hour, int min) {

		int dv = (hour - min + 360) % 360;

		for (int i = 0; i < 12; i++)
			for (int j = 0; j < 60; j += 2) {
				int di = 30 * i + j / 2;
				int dj = 6 * j;
				int d = (di - dj + 360) % 360;
				if (d == dv && (di - hour + 360) % 30 == 0)
					return for2(i, j);
			}

		return "";
	}

	String for1(int a) {
		return (a / 10) + "" + (a % 10);
	}

	String for2(int a, int b) {
		return for1(a) + ":" + for1(b);
	}

}
