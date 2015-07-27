import java.util.HashSet;
import java.util.Set;

public class SRM594 {

	public int minimalPlanets(int[] A, int[] B) {

		int ans = A.length + B.length + 2;
		Set<Integer> dist = new HashSet<Integer>();

		for (int p : A) {
			for (int q : B) {
				dist.clear();
				for (int x : A)
					dist.add(x * q);
				for (int y : B)
					dist.add(y * p);

				ans = Math.min(ans, dist.size());
			}
		}

		return ans;
	}

}
