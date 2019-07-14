import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TressureHunt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * N = "previous row"; S = "next row"; W = "previous column"; E = "next column";
		 * T = "treasure";
		 */

		int count = 0;
		String firstLine = sc.nextLine();
		String[] cr = firstLine.split(" ");
		int rows = Integer.parseInt(cr[0]);
		int columns = Integer.parseInt(cr[1]);
		List<String> dir = new ArrayList<>();
		for (int i = 0; i < rows; i++) {
			String di = sc.nextLine();
			dir.add(di);
		}
		String[][] data = new String[rows][columns];
		for (int r = 0; r < rows; r++) {
			String row = dir.get(r);
			for (int c = 0; c < row.length(); c++) {
				data[r][c] = Character.toString(row.charAt(c));
			}
		}
		int i = 0;
		int j = 0;
		String firstElement = data[i][j];
		while (!firstElement.equals("T") && firstElement != null) {
			switch (firstElement) {
			case "N":
				i = i - 1;
				break;
			case "S":
				i = i + 1;
				break;
			case "W":
				j = j - 1;
				break;
			case "E":
				j = j + 1;
				break;
			default:
				i = 0;
				j = 0;
				break;
			}
			try {
				firstElement = data[i][j];
			} catch (ArrayIndexOutOfBoundsException e) {
				firstElement = null;
				break;
			}
			count = count + 1;
			if(count>i*j) {
				firstElement="Lost"	;
				break;
			}
		}
		if (firstElement == null) {
			System.out.println("Out");
		} else if(firstElement.equals("Lost")){
			System.out.println("Lost");
		}else {
			System.out.println(count);
		}

	}
}
