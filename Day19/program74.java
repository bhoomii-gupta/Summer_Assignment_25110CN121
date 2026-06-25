import java.util.*;
class program74
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns in matrix:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("enter first matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("enter second matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                b[i][j]=sc.nextInt();
        }
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                c[i][j]=a[i][j]-b[i][j];
        System.out.println("Difference Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
