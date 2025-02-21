import java.util.Scanner;
class Triangle_Q_37{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++)
        { 
            
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("@");
            for(int j=1;j<2*i;j++)
            {
                System.out.print(" ");
            }
                
                if(i!=0)
                System.out.print("@");
                
                System.out.println();
        }
        for(int j=1;j< 2* n;j++)
        {
            System.out.print("@");
        }
    }
    }

