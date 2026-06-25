import java.util.*;
class program72
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(ar[j] < ar[j+1]) 
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println("Array in Descending Order:");
        for(int i=0; i<n; i++)
            System.out.print(ar[i] + " ");
        sc.close();
    }
}
