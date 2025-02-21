import java.util.Scanner;
public class Prblm_43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i < 2 * n ; i++)
        {
            System.out.print("@");
        }
        System.out.println();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            for(int j=1;j < (2*n)-(2*i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        for(int i=n-2;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            for(int j=(2*n)-(2*i)-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 1; i < 2 * n ; i++)
        {
            System.out.print("@");
        }
    }
}
