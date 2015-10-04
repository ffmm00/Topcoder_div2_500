import java.util.Arrays;

public class SRM506 {

	public int merge(int[] popu) {

		Arrays.sort(popu);
		int n = popu.length;
		int ans = 1;
		long[] sum = new long[n];

		sum[0] = popu[0];

		for (int i = 1; i < n; i++)
			sum[i] += sum[i - 1] + popu[i];

		for (int i = n - 2; i >= 0; i--) {
			if (sum[i] >= popu[i + 1])
				ans++;
			else
				break;
		}

		return ans;
	}

}
