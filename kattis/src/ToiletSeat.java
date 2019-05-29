import java.util.Scanner;

public class ToiletSeat {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case1 = 0, case2 = 0, case3 = 0;
        String s = sc.nextLine();
        String[] seat = s.split("");

        String initialPosition = seat[0];
        String first = seat[1];

        for (int i = 2; i < seat.length; i++) {
            if (seat[i].charAt(0) != 'U')
                case1 += 2;
        }
        if (initialPosition.equals("D") && first.equals("U"))
            case1++;
        if (initialPosition.equals("D") && first.equals("D"))
            case1++;
        if (initialPosition.equals("U") && first.equals("D"))
            case1 += 2;

        System.out.println(case1);

        // Case 2, always leave down

        for (int i = 2; i < seat.length; i++) {
            if (seat[i].charAt(0) != 'D')
                case2 += 2;
        }

        if (initialPosition.equals("U") && first.equals("D"))
            case2++;
        if (initialPosition.equals("U") && first.equals("U"))
            case2++;
        if (initialPosition.equals("D") && first.equals("U"))
            case2 += 2;

        System.out.println(case2);

        // Case 3, as next wishes

        char lastchar = seat[1].charAt(0);

        for (int i = 2; i < seat.length; i++) {
            if (seat[i].charAt(0) != lastchar)
                case3++;
            lastchar = seat[i].charAt(0);
        }

        if (initialPosition.equals("D") && first.equals("U"))
            case3 += 1;
        if (initialPosition.equals("D") && first.equals("U"))
            case3 += 1;

        System.out.println(case3);
        sc.close();
    }


}
