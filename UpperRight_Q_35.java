import java.util.Scanner;
class UpperRight_Q_35{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n-1;i++)
        { 
            
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            if(i!=0)
            {
                System.out.print("@");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }
        for(int j=1;j<=n;j++)
        {
            System.out.print("@");
        }
        System.out.println();
        
        }
    }

