import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Akcija {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int numBooks = Integer.parseInt(reader.readLine());
		List<Integer> prices = new ArrayList<>();

		for (int i = 0; i < numBooks; i++) {
			prices.add(Integer.parseInt(reader.readLine()));
		}

		int minimalPrice = 0;
		if (prices.size() % 3 != 0) {
			for (int i = 1; i <= 3; i++) {
				int p = prices.size() + i;
				prices.add(0);
				if (p % 3 == 0) {
					break;
				}
			}
		}
		Collections.sort(prices, Collections.reverseOrder());
		int pairs = prices.size() / 3;
		while (pairs != 0) {
			int first = prices.get(0);
			int second = prices.get(1);
			prices.remove(2);
			prices.remove(1);
			prices.remove(0);

			minimalPrice += first + second;
			pairs = pairs - 1;
		}
		System.out.println(minimalPrice);
	}

}
