import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c;

        c = a * (b - 1);
        System.out.println(c + 1);
        sc.close();
    }

}
