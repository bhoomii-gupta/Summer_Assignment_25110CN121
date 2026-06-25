import java.util.*;
class program78
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter order of square matrix: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    c=1;
                    break;
                }
            }
        }
        if(c==0)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
        sc.close();
    }
}