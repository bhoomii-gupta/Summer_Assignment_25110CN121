import java.util.*;
class program53
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
        System.out.println("Enter the element to be searched:");
        int ele=sc.nextInt();
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==ele)
            {
                pos=i;
                break;
            }
        }
        if(pos!=-1)
            System.out.println("element found at "+(pos+1)+" position.");
        else
            System.out.println("element not found.");
        sc.close();
    }
}
