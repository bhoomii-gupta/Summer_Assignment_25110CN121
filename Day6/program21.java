import java.util.*;
class program21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n = sc.nextInt();
        int bin = 0;
        int p = 1;
        int rem=0;
        while(n > 0)
        {
            rem = n % 2;
            bin = bin + (rem * p);
            p = p * 10;
            n = n / 2;
        }
        System.out.println("Binary equivalent is: " + bin);
        sc.close();
    }
}

