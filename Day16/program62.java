import java.util.*;
class program62
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
        int maxf=0;
        int maxe=ar[0];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(ar[i]==ar[j])
                    c++;
            }
            if(c>maxf)
            {
                maxf=c;
                maxe=ar[i];
            }
        }
        System.out.println("Maximum frequency element is: " + maxe);
        sc.close();
    }
}
