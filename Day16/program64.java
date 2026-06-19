import java.util.*;
class program64
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
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
                System.out.print(ar[i]+"\t");
        }
        sc.close();
    }
}
