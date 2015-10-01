public class SRM514 {

	public String isReachable(int[] jumpTypes, int x, int y) {

		for (int a : jumpTypes) {
			if (a % 2 == 0)
				return "YES";
		}

		if ((x + y) % 2 == 0)
			return "YES";

		return "NO";
	}

}
