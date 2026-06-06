import java.util.Scanner;
class program5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int sum=0;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("sum of digits are:"+sum);
        sc.close();
    }
}
