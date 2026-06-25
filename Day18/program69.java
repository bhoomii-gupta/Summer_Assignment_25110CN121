import java.util.*;
class program69
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(ar[j] > ar[j+1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0; i<n; i++)
            System.out.print(ar[i] + " ");
        sc.close();
    }
}