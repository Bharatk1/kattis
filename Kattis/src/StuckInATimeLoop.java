import java.util.Scanner;

public class StuckInATimeLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++)
            System.out.println(i + " Abracadabra");
        sc.close();
    }
}
