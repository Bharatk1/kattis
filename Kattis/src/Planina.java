import java.util.Scanner;

public class Planina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int points = (int) Math.pow(((int) Math.pow(2, n) + 1) , 2);
		System.out.println(points);
		sc.close();
	}

}
