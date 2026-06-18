import java.util.*;
class program58
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int ar1[]=new int[n];
        ar1[n-1]=ar[0];
        for(int i=0;i<n-1;i++)
            ar1[i]=ar[i+1];
        System.out.println("Array after left rotation:");
        for(int i=0;i<n;i++)
            System.out.print(ar1[i]+"\t");
        sc.close();
    }
}