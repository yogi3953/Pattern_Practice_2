import java.util.Scanner;
class Rhombus_39{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<n-i;k++)
            {
                System.out.print(" ");
            }
            System.out.print("@");
            
            for(int j=1;j<2*i;j++)
            {
                System.out.print(" ");
            }
            if(i==0) 
            {
            System.out.println();
            continue;
            }    
            System.out.println("@");
            
            }
        for(int i=1;i<n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            System.out.print("@");
            for(int k=1;k<2* (n-1-i);k++)
            {
                System.out.print(" ");
            }
            if(i==n-1) continue;
            System.out.print("@");
            System.out.println();
        }
            }
        }