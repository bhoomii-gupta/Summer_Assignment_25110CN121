import java.util.*;
class program57
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
        System.out.println("Reverse array:");
        for(int i=n-1;i>=0;i--)
            System.out.print(ar[i]+"\t");
        sc.close();
    }
}