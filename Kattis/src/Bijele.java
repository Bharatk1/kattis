import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pieces = { 1, 1, 2, 2, 2, 8 };
        int[] availablePieces = new int[pieces.length];

        for (int i = 0; i < pieces.length; i++)
            availablePieces[i] = sc.nextInt();
        for (int i = 0; i < pieces.length; i++)
            System.out.print(pieces[i] - availablePieces[i] + " ");
        sc.close();
    }
}
