import java.util.Scanner;

public class Tarifa {

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int totalData = sc.nextInt(), noOfMonths = sc.nextInt() , total = totalData * (noOfMonths + 1);
    // int[] data = new int[noOfMonths];
    //
    // for (int i = 0; i < noOfMonths; i++) {
    // data[i] = sc.nextInt();
    // total = total - data[i];
    // }
    // System.out.println(total);
    // sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalData = sc.nextInt(), noOfMonths = sc.nextInt() , total = totalData * (noOfMonths + 1);
        
        for (int i = 0; i < noOfMonths; i++) {
            total = total - sc.nextInt();
        }
        System.out.println(total);
        sc.close();
    }

}
