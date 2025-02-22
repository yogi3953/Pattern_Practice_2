import java.util.Scanner;
class NumPyramid_Q_40{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int k = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i - j) / (j + 1); 
                
            }
            System.out.println();
        }

        }
        }