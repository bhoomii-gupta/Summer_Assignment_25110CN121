import java.util.*;
class program70
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("enter theb array elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {
                if(ar[j] < ar[min])
                    min = j;
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        System.out.println("Sorted Array:");
        for(int i=0; i<n; i++)
            System.out.print(ar[i] + " ");
        sc.close();
    }
}

