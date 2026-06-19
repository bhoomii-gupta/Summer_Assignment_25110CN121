import java.util.*;
class program63
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
        System.out.println("Enter required sum:");
        int sum=sc.nextInt();
        System.out.println("Pairs are:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]+ar[j]==sum)
                     System.out.println(ar[i] + " + " + ar[j] + " = " + sum);
            }
        }
        sc.close();
    }
}
