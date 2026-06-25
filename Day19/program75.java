import java.util.*;
class program75
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
        System.out.println("Transpose Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(ar[j][i]+" ");
            System.out.println();
        }
        sc.close();
    }
}
