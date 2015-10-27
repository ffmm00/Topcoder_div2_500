public class SRM456 {

	public int minSteps(int sx, int sy, int gx, int gy) {

		int ans = 0;

		if ((sx + sy + gx + gy) % 2 != 0) {
			sy++;
			ans++;
		}

		ans += Math.abs((sx + sy) - (gx + gy)) / 2;
		ans += Math.abs((sx - sy) - (gx - gy)) / 2;

		return ans;
	}

}
