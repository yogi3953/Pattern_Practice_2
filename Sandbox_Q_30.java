import java.util.Scanner;
class Sandbox_Q_30{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                    System.out.print((char) ('A'+j));
                    System.out.print(j+1);
            }
                System.out.println();
            }
            for(int i=2;i<=n;i++)
            {
                for(int k=1;k<=(n-i);k++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++)
                {
                        System.out.print((char) ('A'+j));
                        System.out.print(j+1);
                }
                    System.out.println();
                }
            }
        }