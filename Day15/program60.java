import java.util.*;
class program60
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
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]!=0)
            {
                ar[j]=ar[i];
                j++;
            }
        }
        while(j<n)
        {
            ar[j]=0;
            j++;
        }
        System.out.println("Array after moving zeros:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"\t");
        sc.close();
    }
}
