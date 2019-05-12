import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int j = 0; j < n; j++) {
			num[j] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0)
				System.out.println(num[i] + " is even");
			else
				System.out.println(num[i] + " is odd");
		}
	}

}
