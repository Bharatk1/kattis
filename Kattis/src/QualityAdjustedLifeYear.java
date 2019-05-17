import java.util.Scanner;

public class QualityAdjustedLifeYear {

    // public static void main(String[] args) throws Exception {
    // BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
    //
    // int cases = Integer.parseInt(sc.readLine());
    // double sum = 0;
    // while (cases-- > 0) {
    // String[] tokens = sc.readLine().split(" ");
    // sum += Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[1]);
    // }
    // dc.write(sum + "\n");
    //
    // dc.close();
    // sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < cases; i++) {
            int tokens = sc.nextInt();
            String arr = String.valueOf(tokens);
            String[] ar = arr.split(" ");
            sum += Double.parseDouble(ar[0]) * Double.parseDouble(ar[1]);
        }
        System.out.println(sum);
        sc.close();
    }
}
