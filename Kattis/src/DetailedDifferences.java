import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailedDifferences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		List<String> s = new ArrayList<>();

		for (int i = 0; i < (2 * n); i++) {
			s.add(sc1.nextLine());
		}
		
		int c = s.size();
		while (c--> 0) {
			if(s.size()==0) {
				break;
			}
			System.out.println(s.get(0) + "\n" + s.get(1));

			for (int x = 0; x < s.get(0).length(); x++) {
				if (s.get(0).charAt(x) == s.get(1).charAt(x))
					System.out.print(".");
				else
					System.out.print("*");

			}
			System.out.print("\n" + "\n");

			s.remove(0);
			s.remove(0);

		}
		sc.close();
		sc1.close();
	}

}
