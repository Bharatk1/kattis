import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		String[] split = s.split("");
		int position = 1;
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("A"))
				position = 2;
			else if (split[i].equals("B"))
				position = 3;
			else if (split[i].equals("C"))
				position = 1;
			else 
				position = 1;

		}
		System.out.println(position);
		sc.close();
	}

}
