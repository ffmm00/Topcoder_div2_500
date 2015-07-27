public class SRM593 {

	public String check(String str) {

		int c = 0, i = 0, tmp = 0;
		int len = str.length();

		if (str == null || len < 4)
			return "INVALID";

		while (i < str.length()) {
			c = 0;
			while (i < len && str.charAt(i) == 'w') {
				i++;
				c++;
			}
			if (c == 0)
				return "INVALID";
			tmp = c;
			while (i < len && str.charAt(i) == 'o') {
				i++;
				tmp--;
			}
			if (tmp != 0)
				return "INVALID";
			tmp = c;

			while (i < len && str.charAt(i) == 'l') {
				i++;
				tmp--;
			}
			if (tmp != 0)
				return "INVALID";
			tmp = c;

			while (i < len && str.charAt(i) == 'f') {
				i++;
				tmp--;
			}
			if (tmp != 0)
				return "INVALID";

		}

		return "VALID";
	}

}
