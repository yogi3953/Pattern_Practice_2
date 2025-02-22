import java.util.Scanner;
class LeftTriangleNumAB_Q_28{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=2*(n-i);k++)
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