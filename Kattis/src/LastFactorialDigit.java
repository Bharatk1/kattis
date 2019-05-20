import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int k = 1; k <= num[j]; k++) {
                fact *= k;
            }
            System.out.println(fact % 10);
            fact = 1;
            sc.close();
        }
    }
}
