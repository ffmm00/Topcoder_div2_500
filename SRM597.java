import java.util.Arrays;

public class SRM597 {

	public int getNumber(String A, String B) {

		char[] charA = A.toCharArray();
		char[] charB = B.toCharArray();

		Arrays.sort(charA);
		Arrays.sort(charB);

		for (int i = 0; i < A.length(); i++) {
			if (charA[i] != charB[i]) {
				return -1;
			}
		}


		int index = B.length() - 1;
		int c = 0;

		for (int i = A.length() - 1; i >= 0; i--) {
			if (A.charAt(i) == B.charAt(index)) {
				c++;
				index--;
			}
		}

		return A.length() - c;
	}

}
