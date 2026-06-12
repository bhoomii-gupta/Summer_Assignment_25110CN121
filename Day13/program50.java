import java.util.*;
class program50
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
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=ar[i];
        float avg= sum/n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        sc.close();
    }
}
