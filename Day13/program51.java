import java.util.*;
class program51
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
        int lg=ar[0];
        int sm=ar[0];
        for(int i=0;i<n;i++)
        {
            if(ar[i]>lg)
                lg=ar[i];
            if(ar[i]<sm)
                sm=ar[i];
        }
        System.out.println("Largest element: "+lg);
        System.out.println("smallest element: "+sm);
        sc.close();
    }
}
