public class SRM666 {

	public String isGood(String s) {

		int a = 0;

		for (int i = 0; i < s.length()&&a>=0; i++) {
			if (s.charAt(i) == 'a')
				a++;
			else
				a--;
		}

		if (a == 0)
			return "Good";

		return "Bad";
	}

}
