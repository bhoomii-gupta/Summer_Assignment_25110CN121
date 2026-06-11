import java.util.*;
class program28
{
    int r=0;
    int rev(int n)
    {
        if(n==0)
            return r;
        else
        {
            r=r*10 + (n%10);
            return rev(n/10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        program28 ob=new program28();
        System.out.println("reverse number = " + ob.rev(n));
        sc.close();
    }
}

