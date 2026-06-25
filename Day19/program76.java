import java.util.*;
class program76
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix:");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        System.out.println("enter matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                ar[i][j]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<3;i++)
            sum+=ar[i][i];
        System.out.println("Diagonal Sum = "+sum);
        sc.close();
    }
}
