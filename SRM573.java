import java.util.Arrays;

public class SRM573 {

	public int worstRank(int[] strength) {

		int L = strength.length;

		int[] A = new int[] { strength[0], strength[1], strength[2] };

		int[] B = new int[L - 3];

		for (int i = 3; i < L; i++) {
			B[i - 3] = strength[i];
		}

		Arrays.sort(A);
		Arrays.sort(B);

		int F = A[1] + A[2];
		int res = 1;

		for (int i = L - 4, j = L / 3 - 1; i > j; j++) {
			if (B[i] + B[j] > F) {
				res++;
				i--;
			}
		}

		return res;
	}

}
