import java.util.Scanner;

public class TakeTwoStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i >= 1 && i <= 10000000)
            if ((i % 2) == 0)
                System.out.println("Bob");
            else
                System.out.println("Alice");
        sc.close();
    }

}
