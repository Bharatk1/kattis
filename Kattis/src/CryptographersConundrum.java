import java.util.Scanner;

public class CryptographersConundrum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ciper = sc.nextLine();
		String[] split = ciper.split("");
		int count = 0;
		for(int i = 0 ; i<split.length ; i++) {
			if(split[i].equalsIgnoreCase("P"))
				count++;
			if(split[i+1].equalsIgnoreCase("E"))
				count++;
			if(split[i+2].equalsIgnoreCase("R"))
				count++;
			
			i+=2;
		}
		System.out.println(ciper.length() - count);
		sc.close();
	}

}
