import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , sum = 0;
		while(n--> 0) {
			int s = sc.nextInt();
			int power = s%10;
			int number = s/10;
			sum += Math.pow(number, power);
		}
		System.out.println(sum);
	sc.close();
	}
}
