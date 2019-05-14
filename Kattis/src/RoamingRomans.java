import java.util.Scanner;

public class RoamingRomans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = Double.parseDouble(sc.nextLine());
		System.out.println(Math.round(x * 1000 * 5280 / 4854));
		sc.close();
	}

}