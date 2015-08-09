public class SRM572 {

	public int getMinimum(int nextCost, int prevCost, String start, String goal) {

		int N = start.length();

		for (int i = 0; i < N - 1; i++)
			for (int j = i + 1; j < N; j++)
				if (start.charAt(i) < start.charAt(j) != goal.charAt(i) < goal
						.charAt(j))
					return -1;

		int ans = 0;

		for (int i = 0; i < N; i++) {
			if (goal.charAt(i) > start.charAt(i))
				ans += (goal.charAt(i) - start.charAt(i)) * nextCost;
			else
				ans += (start.charAt(i) - goal.charAt(i)) * prevCost;
		}

		return ans;
	}

}
