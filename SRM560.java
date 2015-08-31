import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SRM560 {

	public int minKeystrokes(int[] fre, int[] keySizes) {

		List<Integer> list = new ArrayList<Integer>();

		int t = 0;

		for (int i : keySizes) {
			while (i > 0) {
				list.add(i);
				i--;
			}
		}

		if (fre.length > list.size())
			return -1;

		Collections.sort(list);
		Arrays.sort(fre);

		int ans = 0;

		for (int i = 0; i < fre.length; i++)
			ans += fre[fre.length - i - 1] * list.get(i);

		return ans;
	}

}
