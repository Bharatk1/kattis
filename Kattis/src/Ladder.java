import java.util.Scanner;

public class Ladder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt() , d = sc.nextInt();
        System.out.println((int) Math.ceil(n / Math.sin(Math.toRadians(d))));
        sc.close();
    }

}
