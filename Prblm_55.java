import java.util.Scanner;
class Prblm_55 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         
        for(int i=1;i<=n;i++)
        {
            int c=n;
            int k=i;
            for(int j=1;j<=n-i;j++)
            {
                if(j==1) System.out.print(i);
                 k+=c;
                System.out.print(" "+k);
                c--;
            }
            if(i==n) System.out.print(i);
            System.out.println();
        }
        }
    }