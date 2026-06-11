import java.util.*;
class program47
{
    void fib()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=0,b=1;
        int c;
        System.out.println("Fibonacci series:");
        if(n==0)
            System.exit(0);
        if(n==1)
            System.out.print(a);
        else
        {
            System.out.print(a+"\t"+b);
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                System.out.print("\t"+c);
                a=b;
                b=c;
            }
        }
        sc.close();
    }
    public static void main(String args[])
    {
        program47 ob=new program47();
        ob.fib();
    }
}
