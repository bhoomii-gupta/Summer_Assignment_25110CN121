import java.util.*;
class program26
{
    int fib(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position:");
        int n=sc.nextInt();
        program26 ob=new program26();
        System.out.println("Fibonacci term = " + ob.fib(n));
        sc.close();
    }
}

