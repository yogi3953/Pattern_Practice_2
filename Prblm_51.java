import java.util.Scanner;
class Prblm_51 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        }
    }