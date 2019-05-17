import java.text.DecimalFormat;
import java.util.Scanner;

public class GrassSeedInc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cost = sc.nextDouble(), k = 0;
		int n = sc.nextInt();
		DecimalFormat df = new DecimalFormat("#.000000");
		while (n-- > 0) {
			k += sc.nextDouble() * sc.nextDouble();
		}
		System.out.println(df.format(cost * k));
		sc.close();
	}

}
