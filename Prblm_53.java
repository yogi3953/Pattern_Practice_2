import java.util.Scanner;
class Prblm_53 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print(i+1);
            for(int j=1;j<(2*i);j++)
            {
                System.out.print(" ");
            }
            if(i==0) 
            {
                System.out.println();
                continue;
            }
            System.out.println(i+1);
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<(2*(i-1));j++)
            {
                System.out.print(" ");
            }
            if(i==1) 
            {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
        }
    }