import java.util.*;
class program79
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows and columns of matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        int sum=0;
        for(int i=0;i<r;i++)
        {
            sum=0;
            for(int j=0;j<c;j++)
                sum+=a[i][j];
            System.out.println("row "+(i+1)+" sum= "+sum);
        }
        sc.close();
    }
}
