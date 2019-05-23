import java.util.Scanner;

public class TheAmazingHumanCannonball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		String[] arr = new String[n];

		for (int j = 0; j < n; j++) 
			arr[j] = sc1.nextLine();

		for (int i = 0; i < n; i++) {

			String[] split = arr[i].split(" ");

			double velocity = Double.parseDouble(split[0]), angle = Double.parseDouble(split[1]),
					holeX = Double.parseDouble(split[2]), holeY1 = Double.parseDouble(split[3]),
					holeY2 = Double.parseDouble(split[4]);

			double t = holeX / velocity / Math.cos(Math.toRadians(angle));
			double y = velocity * t * Math.sin(Math.toRadians(angle)) - 4.905 * Math.pow(t, 2);

			if (y - holeY1 >= 1 && holeY2 - y >= 1)
				System.out.println("Safe");
			else
				System.out.println("Not Safe");
		}
		sc.close();sc1.close();
	}

}
