import java.util.*;
class program44
{
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        program44 ob=new program44();
        System.out.println("Factorial: "+ob.fact(n));
        sc.close();
    }
}
