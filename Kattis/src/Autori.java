import java.util.Scanner;

public class Autori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();

        String[] firstLetter = names.split("-");
        for (int i = 0; i < firstLetter.length; i++)
            System.out.print(firstLetter[i].substring(0, 1));
        sc.close();
    }

}
