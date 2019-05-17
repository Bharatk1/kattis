import java.util.HashSet;
import java.util.Scanner;

public class IveBeenEverywhereMan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int c = sc.nextInt();
            HashSet<String> hset = new HashSet<String>();
            for (int i = 0; i < c; i++) {
                hset.add(sc1.nextLine());
            }
            System.out.println(hset.size());
        }
        sc.close();
        sc1.close();
    }

}
