import java.util.HashSet;

public class SRM595 {

	public int getNumber(int M, int[] L, int[] R) {

		int[] arr = new int[M + 1];
		HashSet<Integer> check = new HashSet<Integer>();

		for (int i = 0; i < L.length; i++)
			for (int x = L[i]; x <= R[i]; x++) {
				arr[x] = i + 1;
			}

		for (int i = 1; i <= M; i++) {
			if (arr[i] != 0)
				check.add(arr[i]);
		}

		return (int) Math.pow(2, check.size());
	}

}
