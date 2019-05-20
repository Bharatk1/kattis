import java.util.Scanner;

public class Bela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String no = sc.nextLine();
        String[] split = no.split(" ");
        int n = Integer.parseInt(split[0]) , total = 0, val = 0;
        char dominant = split[1].charAt(0);
        char[] ch = {'A', 'K', 'Q', 'J', 'T', '9', '8', '7'};
        
        int[] dominat = {11, 4, 3, 20, 10, 14, 0, 0};
        int[] nonDominat = {11, 4, 3, 2, 10, 0, 0, 0};
        
        String[] cards = new String[4 * n];

        for (int i = 0; i < 4 * n; i++) {
            cards[i] = sc.nextLine();
        }

        for (int j = 0; j < 4 * n; j++) {
            for (int k = 0; k < ch.length; k++) {
                if (ch[k] == cards[j].charAt(0)) {
                    val = k;
                }
            }
            if (cards[j].charAt(1) == dominant)
                total += dominat[val];
            else
                total += nonDominat[val];
        }

        System.out.println(total);
        sc.close();
    }

}
