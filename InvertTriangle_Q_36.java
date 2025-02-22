import java.util.Scanner;
class InvertTriangle_Q_36{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int j=1;j< 2* n;j++)
        {
            System.out.print("@");
        }
        System.out.println();
        for(int i=2;i<=n;i++)
        { 
            
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
                System.out.print("@");
                for(int j=0;j<n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<n-i;j++)
                {
                    System.out.print(" ");
                }
                if(i!=n)
                System.out.print("@");
                
            System.out.println();
        }
        }
    }

