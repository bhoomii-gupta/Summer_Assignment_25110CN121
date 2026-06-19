import java.util.*;
class program67
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the first array:");
        n=sc.nextInt();
        int ar1[]=new int[n];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n;i++)
            ar1[i]=sc.nextInt();
        int m;
        System.out.println("Enter the number of elements in the second array:");
        m=sc.nextInt();
        int ar2[]=new int[m];
        System.out.println("Enter second array elements:");
        for(int i=0;i<m;i++)
            ar2[i]=sc.nextInt();
        int ar[]=new int[n+m];
        int size=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(ar1[i]==ar2[j])
                {
                    c++;
                    break;
                }
            }
            if(c!=0)
            {
                ar[size]=ar1[i];
                size++;
            }
        }
        System.out.println("intersection array: ");
        for(int i=0;i<size;i++)
            System.out.print(ar[i]+"\t");
        sc.close();
    }
}

