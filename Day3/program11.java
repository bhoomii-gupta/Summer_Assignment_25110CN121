import java.util.Scanner;
class program11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd = 1;
        int min=0;
        if(a>b)
            min=b;
        else
            min=a;
        for(int i = 1; i<=min; i++)
        {
            if(a % i == 0 && b % i == 0)
                gcd=i;
        }
        System.out.println("GCD = " + gcd);
        sc.close();
    }
}
