import java.util.Scanner;
class program6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int rev=0;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        System.out.println("reverse number:"+rev);
        sc.close();
    }
}

