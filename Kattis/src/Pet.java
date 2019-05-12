import java.util.Scanner;
import java.util.TreeMap;

public class Pet {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); TreeMap<Integer, Integer> val = new
		 * TreeMap<>();
		 * 
		 * for (int i = 1; i < 6; i++) { int k = sc.nextInt() + sc.nextInt() +
		 * sc.nextInt() + sc.nextInt(); val.put(k, i); }
		 * System.out.println(val.get(val.lastKey()) + " " + val.lastKey()); sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		int sum = 0, winner = 0;
		for (int i = 1; i < 6; i++) {
			int k = 0;
			for (int j = 0; j < 4; j++) {
				k += sc.nextInt();
			}
			if (k > sum) {
				sum = k;
				winner = i;
			}
		}
		System.out.println(winner + " " + sum);
		sc.close();
	}

}
