public class SRM587 {

	public int furthest(int N, int badStep) {

		int step = 0;

		for (int i = 1; i <= N; i++) {
			step += i;
			if (step == badStep)
				step--;
		}

		return step;
	}

}
