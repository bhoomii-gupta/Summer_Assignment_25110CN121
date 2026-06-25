import java.util.*;
class program71
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("enter the element to be searched:");
        int ele=sc.nextInt();
        int lb=0,ub=n-1,mid=(lb+ub)/2;
        while((lb<=ub)&&(ar[mid]!=ele))
        {
            if(ele<mid)
                ub=mid-1;
            else
                lb=mid+1;
            mid=(lb+ub)/2;
        }
        if(ar[mid]==ele)
            System.out.println("element found at "+(mid+1)+" position.");
        else
            System.out.println("element not found.");
        sc.close();
    }
}