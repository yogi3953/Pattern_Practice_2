import java.util.Scanner;
public class Prblm_56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int min = Math.min(Math.min(i, j), Math.min((2 * n - 2) - i, (2 * n - 2) - j));
                System.out.print((n - min) + "");
            }
            System.out.println();
        }
    }
}
