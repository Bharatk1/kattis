import java.util.Scanner;

public class HissingMicrophone {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String message = "no hiss";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 's' && str.charAt(i + 1) == 's') {
				message = "hiss";
				break;
			}
		}
		System.out.println(message);
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.contains("ss") ? "hiss" : "no hiss");
		sc.close();
	}

}
