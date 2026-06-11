import java.util.*;
class program22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n = sc.nextInt();
        int dec = 0;
        int p = 1;
        int rem=0;
        while(n > 0)
        {
            rem = n % 10;
            dec = dec + (rem * p);
            p = p * 2;
            n = n / 10;
        }
        System.out.println("Decimal equivalent is: " + dec);
        sc.close();
    }
}

