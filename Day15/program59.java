import java.util.*;
class program59
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
        ar1[0]=ar[n-1];
        for(int i=1;i<n;i++)
            ar1[i]=ar[i-1];
        System.out.println("Array after right rotation:");
        for(int i=0;i<n;i++)
            System.out.print(ar1[i]+"\t");
        sc.close();
    }
}