import java.util.Scanner;
class Prblm_27{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<=2*i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                    System.out.print((char) ('A'+j));
                    System.out.print(n-j);
            }
                System.out.println();
            }
            }
        }