import java.util.Scanner;
class Diamond_Q_32{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            for(int i=1;i<=n;i++)
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
                for(int i=n-1;i>=1;i--)
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