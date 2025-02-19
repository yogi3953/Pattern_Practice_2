import java.util.Scanner;
class SandBox_Q_38{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
        for(int i=1;i<=n-2;i++)
        { 
            
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
                System.out.print("@");
                for(int j=1;j<(2*i);j++)
                {
                        System.out.print(" ");
                    }
                System.out.print("@");                
            System.out.println();
        }
        for(int j=1;j< 2* n;j++)
        {
            System.out.print("@");
        }
        }
    }

