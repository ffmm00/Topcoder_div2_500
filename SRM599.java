
public class SRM599 {

	public String isDivisible(int A, int B, int C, int D) {

		for (int i = 2; i * i <= Math.max(A, C); i++) {

			long kA = 0, kC = 0;
			while (A % i == 0) {
				A /= i;
				kA += B;
			}
			while (C % i == 0) {
				C /= i;
				kC += D;
			}
			if (kC > kA)
				return "not divisible";
		}

		if (C == 1 || A == C && B >= D)
			return "divisible";

		return "not divisible";

	}

}
