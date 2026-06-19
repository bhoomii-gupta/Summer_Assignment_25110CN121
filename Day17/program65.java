import java.util.*;
class program65
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the first array:");
        n=sc.nextInt();
        int ar1[]=new int[n];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n;i++)
            ar1[i]=sc.nextInt();
        int m;
        System.out.println("Enter the number of elements in the second array:");
        m=sc.nextInt();
        int ar2[]=new int[m];
        System.out.println("Enter second array elements:");
        for(int i=0;i<m;i++)
            ar2[i]=sc.nextInt();
        int ar[]=new int[n+m];
        for(int i=0;i<n;i++)
            ar[i]=ar1[i];
        for(int i=n;i<m+n;i++)
            ar[i]=ar2[i-n];
        System.out.println("merged array: ");
        for(int i=0;i<n+m;i++)
            System.out.print(ar[i]+"\t");
        sc.close();
    }
}
