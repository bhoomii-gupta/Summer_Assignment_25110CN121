import java.util.*;
class program49
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Array:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"\t");
    }
}