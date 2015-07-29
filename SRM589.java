public class SRM589 {

	public int getmin(String D) {

		int count = D.length();
		int callWhile = 0;
		while (D.charAt(0) == D.charAt(count - 1) && callWhile < count) {
			D = D.charAt(count - 1) + D.substring(0, count - 1);
			callWhile++;
		}

		int ans = 0;
		D += D.charAt(0);
		for (int i = 1; i <= count; i++)
			if (D.charAt(i) == D.charAt(i - 1)) {
				i++;
				ans++;
			}

		return ans;
	}

}
