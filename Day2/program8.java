import java.util.Scanner;
class program8
{
    public static void main(String args[])
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
            System.out.println("palindrome number.");
        else
            System.out.println("not a palindrome number.");
        sc.close();
    }
}
