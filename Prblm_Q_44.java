import java.util.Scanner;
class Prblm_Q_44_skip
{
    public static void main(String[]args)
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=100;j++)
            {
                System.out.print(i+" ");
                if(i==10)
                {
                    System.out.println();
                }
                System.out.println(i);
                
            }
        }
    }
}