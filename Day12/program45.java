import java.util.*;
class program45
{
    void palin()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int n1=n;
        int rev=0;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        if(rev==n1)
            System.out.println(n1+" is a palindrome number.");
        else
            System.out.println(n1+" is not a palindrome number.");
        sc.close();
    }
    public static void main(String args[])
    {
        program45 ob=new program45();
        ob.palin();
    }
}
