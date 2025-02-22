import java.util.Scanner;
class Prblm_47 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
         System.out.println(0);
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
                if(j==n)
                {
                    System.out.print(0);
                    for(int k=n;k>=i;k--)
                    {
                        System.out.print(k);
                    }
                }
            }
            System.out.println();
        }
        }
    }