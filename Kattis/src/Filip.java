import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        if (a > b)
            System.out.println(sb.append(Integer.toString(a)).reverse());
        else
            System.out.println(sb.append(Integer.toString(b)).reverse());
        sc.close();
    }
}
