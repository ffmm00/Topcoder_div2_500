public class SRM583 {

	public String verify(String id, String[] regionCodes) {

		boolean bo = false;

		for (int i = 0; i < regionCodes.length; i++) {
			if (id.startsWith(regionCodes[i])) {
				bo = true;

			}
		}

		if (!bo)
			return "Invalid";

		int year = Integer.valueOf(id.substring(6, 10));
		int month = Integer.valueOf(id.substring(10, 12));
		int day = Integer.valueOf(id.substring(12, 14));
		int seq = Integer.valueOf(id.substring(14, 17));

		if (seq == 0)
			return "Invalid";

		if (year < 1900 || year > 2011 || day < 1 || day > 31 || month < 1
				|| month > 12)
			return "Invalid";

		if (month == 2)
			if (day > 29
					|| (day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))))
				return "Invalid";

		if (day == 31
				&& !(month == 1 || month == 3 || month == 5 || month == 7
						|| month == 8 || month == 10 || month == 12))
			return "Invalid";

		long base = 2;
		long sum = id.charAt(17) == 'X' ? 10 : id.charAt(17) - '0';
		for (int i = 16; i >= 0; i--) {
			sum += (id.charAt(i) - '0') * base;
			base *= 2;
		}

		if (sum % 11 != 1)
			return "Invalid";

		if (seq % 2 == 1)
			return "Male";

		return "Female";

	}

}
