import java.util.*;
class program27
{
    int sum(int n)
    {
        if(n == 0)
            return 0;
        else
            return (n % 10) + sum(n / 10);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        program27 ob=new program27();
        System.out.println("Sum of digits = " + ob.sum(n));
        sc.close();
    }
}

