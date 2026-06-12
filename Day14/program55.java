import java.util.*;
class program55
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
        for(int i=0;i<n;i++)
        {
            if(ar[i]>lg)
                lg=ar[i];
        }
        int sl=ar[0];
        for(int i=0;i<n;i++)
        {
            if(sl<ar[i] && ar[i]<lg)
                sl=ar[i];
        }
        System.out.println("Second largest element: "+sl);
        
        sc.close();
    }
}
