import java.util.Scanner;
import java.lang.Math;
class Prblm_50
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j< 2*i;j++)
            {
                int k= (int) Math.pow(a,2);
                System.out.print(k+" ");
                a++;
            }
            System.out.println();
        }
    }
}