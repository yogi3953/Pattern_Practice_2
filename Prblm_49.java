import java.util.Scanner;
class Prblm_49 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                    System.out.print(i);
                    if(j==i) break;
                   System.out.print("*");
             }
             System.out.println();
            }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                    System.out.print(i);
                    if(j==i) break;
                   System.out.print("*");
             }
             System.out.println();
            }
        }
    }