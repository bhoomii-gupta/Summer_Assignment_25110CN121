import java.util.Scanner;
class program14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=0,b=1;
        int c=0;
        if(n==0)
        {
            System.out.print("Inavlid Input.");
            System.exit(0);
        }
        if(n==1)
           c=a;
        else if(n==2)
            c=b;
        else
        {
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
        }
        System.out.print("Fibonacci term at "+n+" position is:"+c);
        sc.close();
    }
}
