import java.util.Scanner;
class Prblm_52
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                for(int k=1;k<i;k++)
                {
                    System.out.print(" ");
                }
                System.out.print(i);
                //for(int k=1;k<=)
            }
        }
    }
}