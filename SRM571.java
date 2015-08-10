import java.util.Arrays;

public class SRM571 {

	public String[] playList(int n) {

		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = i + 1 + ".mp3";
		}

		Arrays.sort(s);

		String s2[] = new String[0];
		if (n < 50)
			s2 = new String[n];
		else
			s2 = new String[50];

		for (int i = 0; i < s2.length; i++)
			s2[i] = s[i];

		return s2;
	}

}
