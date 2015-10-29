public class SRM450 {

	public String winner(int[] layout) {

		int i = 0;
		while (i < layout.length && layout[i] == 1)
			i++;

		if (i == layout.length)
			return (i % 2 == 0) ? "Bob" : "Alice";
		else if (i % 2 == 1)
			return "Bob";
		else
			return "Alice";
	}
}
