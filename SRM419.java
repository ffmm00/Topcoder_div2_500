import java.util.StringTokenizer;

public class SRM419 {

	public static String getText(String[] commands, int[] time) {

		StringBuilder sb = new StringBuilder();

		for (int i = time.length - 1; i >= 0; i--) {
			StringTokenizer st = new StringTokenizer(commands[i], " ");
			String command = st.nextToken();

			if (command.equals("type"))
				sb.append(st.nextToken().trim());
			else {
				int v = time[i] - Integer.parseInt(st.nextToken().trim());
				while (i > 0 && time[i - 1] >= v)
					i--;
			}

		}

		return sb.reverse().toString();

	}

}
