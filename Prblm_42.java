import java.util.Scanner;
class Prblm_42
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=(2*n);i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*i;k++)
            {
                    System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=(2*n);i++)
        {
            System.out.print("*");
        }
    }
}